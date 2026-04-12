// Base class
class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    // Constructor
    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    // Constructor (Constructor Chaining)
    Car(String vehicleNumber, String brand, String fuelType,
        int numberOfSeats, boolean ACavailable) {

        super(vehicleNumber, brand, fuelType); // calling parent constructor
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    // Overriding method
    @Override
    void displayDetails() {
        super.displayDetails(); // calling parent method
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

// Subclass ElectricCar
class ElectricCar extends Car {
    private double batteryCapacity;
    private double chargingTime;

    // Constructor
    ElectricCar(String vehicleNumber, String brand, String fuelType,
                int numberOfSeats, boolean ACavailable,
                double batteryCapacity, double chargingTime) {

        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    // Overriding method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Object of Vehicle
        Vehicle v1 = new Vehicle("GJ01AB1234", "Honda", "Petrol");
        System.out.println("\n--- Vehicle Details ---");
        v1.displayDetails();

        // Object of Car
        Car c1 = new Car("GJ05CD5678", "Hyundai", "Diesel", 5, true);
        System.out.println("\n--- Car Details ---");
        c1.displayDetails();

        // Object of ElectricCar
        ElectricCar e1 = new ElectricCar("GJ03EF9999", "Tesla", "Electric",
                5, true, 75.0, 1.5);
        System.out.println("\n--- Electric Car Details ---");
        e1.displayDetails();

        // Upcasting
        Vehicle v2 = new Car("GJ02XY1111", "Maruti", "Petrol", 4, false);
        System.out.println("\n--- Upcasting Example ---");
        v2.displayDetails();

        // Downcasting with instanceof
        if (v2 instanceof Car) {
            Car c2 = (Car) v2; // Downcasting
            System.out.println("Downcasting successful: Accessing Car features");
            System.out.println("Seats: " + c2.numberOfSeats);
        }

        // instanceof check for ElectricCar
        if (e1 instanceof ElectricCar) {
            System.out.println("\nObject e1 is instance of ElectricCar");
        }
    }
}
