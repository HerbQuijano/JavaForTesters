package inheritance2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2020);
        vehicle.start();
        vehicle.stop();
        vehicle.displayInfo();

        System.out.println();

        Car car = new Car("Honda", "Civic", 2021, 4);
        car.start();
        car.stop();
        car.openTrunk();
        car.displayInfo();
    }
}