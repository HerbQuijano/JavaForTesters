package methodoverriding;

// Subclass (inherits from Animal)
public class Dog extends Animal {

    // Overriding the makeSound method from the Animal class
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}