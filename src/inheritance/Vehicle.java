package inheritance;

public class Vehicle {
    int speed;
    int acceleration;
    boolean isRegistered;
    int numDoors;
    int numWheels;

    public Vehicle(int speed, int acceleration, boolean isRegistered, int numDoors, int numWheels) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.isRegistered = isRegistered;
        this.numDoors = numDoors;
        this.numWheels = numWheels;
    }

    public Vehicle(int speed, int acceleration, boolean isRegistered, int numWheels) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.isRegistered = isRegistered;
        this.numWheels = numWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }
    
    public void accelerate(){
        this.speed += this.acceleration;
    }
    
    public void decelerate(){
        this.speed -= this.acceleration;
    }

    public void brake(){
        this.speed = 0;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }


        public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumDoors(){
        return this.numDoors;
    }
    
    public int getNumWheels(){
        return this.numWheels;
    }

    @Override
    public String toString() {
        return "Speed: " + this.speed + " Acceleration: " + this.acceleration + " IsRegistered: " + this.isRegistered;
    }
}
