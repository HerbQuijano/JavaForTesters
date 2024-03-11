package abstraction;


// Parrot class extends Animal and implements the Flyable interface
public class Parrot extends Animal implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("Squawk");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}