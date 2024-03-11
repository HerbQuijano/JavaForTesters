package abstraction;

// Bird class extends the abstract class Animal
public class Bird extends Animal {
    // Implementation of the abstract method from Animal class
    @Override
    public void makeSound() {
        System.out.println("Tweet");
    }
}