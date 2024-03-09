package inheritance;

public class Bike extends Vehicle {
    private String make;
    private String model;
    private String color;

    public Bike(int speed, int acceleration, int numWheels, boolean isRegistered, String make, String model, String color)
    {
        super(speed, acceleration, isRegistered, numWheels);
        this.make = make;
        this.model = model;
        this.color = color;
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
    public void accelerate() {}
    public void decelerate() {}
    public void brake() {}
    public void setSpeed(int speed) {}
    public void setAcceleration(int acceleration) {}
    public void setRegistered(boolean registered) {}

    @Override
    public String toString() {
        return "Bike{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", acceleration=" + acceleration +
                ", isRegistered=" + isRegistered +
                ", numWheels=" + numWheels +
                '}';
    }
}
