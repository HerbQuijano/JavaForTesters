package inheritance;

public class Car extends Vehicle {
    
    private String make;
    private String model;
    private String color;

    public Car(int speed, int acceleration, boolean isRegistered, int numDoors, int numWheels, String make, String model, String color) {
        super(speed, acceleration, isRegistered, numDoors, numWheels);
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public void accelerate() {
        super.accelerate();
    }
    public void decelerate() {
        super.decelerate();
    }
    public void brake() {
        super.brake();
    }
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }
    public void setAcceleration(int acceleration) {
        super.setAcceleration(acceleration);
    }
    public boolean isRegistered() {
        return super.isRegistered();
    }
    public void setRegistered(boolean registered) {
        super.setRegistered(registered);
    }
    public int getSpeed() {
        return super.getSpeed();
    }
    public int getAcceleration() {
        return super.getAcceleration();
    }
    public int getNumDoors() {
        return super.numDoors;
    }
    public void setNumDoors(int numDoors) {
        super.setNumDoors(numDoors);
    }
    public int getNumWheels() {
        return super.numWheels;
    }
    public void setNumWheels(int numWheels) {
        super.setNumWheels(numWheels);
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "Speed: " + speed + ", Acceleration: " + acceleration + ", Registered: " + isRegistered + ", numDoors=" + numDoors + ", numWheels=" + numWheels + ", make=" + make + ", Color: " + color + ", Model: " + model + '}';
    }
}
