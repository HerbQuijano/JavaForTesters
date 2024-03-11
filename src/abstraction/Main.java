package abstraction;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Output: Woof
        dog.sleep(); // Output: Zzz

        Animal bird = new Bird();
        bird.makeSound(); // Output: Tweet

        Parrot parrot = new Parrot(); 
        parrot.makeSound(); // Output: Squawk
        parrot.fly(); // Output: Parrot is flying
    }
}

/* Animal is an abstract class with an abstract method makeSound() and a regular method sleep().
Dog and Bird are concrete classes that extend the abstract class Animal and provide implementations for the abstract method makeSound().
Flyable is an interface with an abstract method fly().
Parrot is a concrete class that extends Animal and implements the Flyable interface, providing implementations for both makeSound() and fly() methods.
In the Main class, we create instances of Dog, Bird, and Parrot and call their methods to demonstrate abstraction. */