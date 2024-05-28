package b.objectConstructorMethod;

    public class Car {
        // Attributes
        private final String make;
        private final String model;
        private final int year;
        private final String color;

        // Constructor
        public Car(String make, String model, int year, String color) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.color = color;
        }

        // Method to display information about the car
        public void displayInfo() {
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Color: " + color);
        }

        public static void main(String[] args){

            // Create a new Car object
            Car myCar = new Car("Toyota", "Yaris", 2015, "Grey");
            // Display initial information
            System.out.println("Initial Car Information:");
            myCar.displayInfo();

        }
    }

