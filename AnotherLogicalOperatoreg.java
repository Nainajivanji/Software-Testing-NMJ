package arithmeticOperators;

public class AnotherLogicalOperatoreg {

        public static void main(String[] args) {
            int a = 10;
            System.out.println(a<10 & a<20); //returns false
            System.out.println(a<10 || a<20); //returns true
            System.out.println(!(a<10 & a<20)); //returns true
        }
    }

