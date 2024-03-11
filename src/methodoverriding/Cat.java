package methodoverriding;

// Another subclass (inherits from Animal)
public class Cat extends Animal {

    // Overriding the makeSound method from the Animal class
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}