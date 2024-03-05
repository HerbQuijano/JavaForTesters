package oopsconcepts;

public class Bike {
    private String make;
    private String type;
    private int speed = 60;

    public Bike(String make, String type, int speed) {
        this.make = make;
        this.type = type;
        this.speed = speed;
        }

    public Bike(String make, String type) {
        this.make = make;
        this.type = type;
    }
    
    public String getMake() {
        return make;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setMake(String make) {
        this.make = make;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        this.speed++;
    }

    public void decelerate() {
        this.speed--;
    }

    public void brake() {
        this.speed = 0;
        System.out.println("Braking");
    }

    @Override
    public String toString() {
        return "Bike{" + "make=" + make + ", type=" + type + ", speed=" + speed + '}';
    }

}
