package inheritance2;

// Subclass (child class) inherits from Vehicle
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Call the constructor of the parent class (Vehicle)
        this.numberOfDoors = numberOfDoors;
    }

    // Additional method specific to Car
    public void openTrunk() {
        System.out.println("Trunk is open");
    }

    // Overriding the displayInfo method from Vehicle class
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method from Vehicle class
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}