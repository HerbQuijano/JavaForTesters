package abstraction;

// Dog class extends the abstract class Animal
public class Dog extends Animal {
    // Implementation of the abstract method from Animal class
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}