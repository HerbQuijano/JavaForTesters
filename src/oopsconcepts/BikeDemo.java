package oopsconcepts;

public class BikeDemo {
    

    public static void main(String[] args) {
        Bike bike1 = new Bike("BMW", "Chopper", 120);
        Bike bike2 = new Bike("Bentley", "Scooter");

        System.out.println(bike1.toString());
        System.out.println(bike2.toString());
    }

}
