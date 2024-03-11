package abstraction;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Output: Woof
        System.out.println("Dog goes to sleep");
        dog.sleep(); // Output: Zzz

        Animal bird = new Bird();
        bird.makeSound(); // Output: Tweet
        // bird.fly();

        Parrot parrot = new Parrot(); 
        parrot.makeSound(); // Output: Squawk
        parrot.fly(); // Output: Parrot is flying
        
        System.out.println("Parrot goes to sleep");
        parrot.sleep();
    }
}

/* Animal is an abstract class with an abstract method makeSound() and a regular method sleep().
Dog and Bird are concrete classes that extend the abstract class Animal and provide implementations for the abstract method makeSound().
Flyable is an interface with an abstract method fly().
Parrot is a concrete class that extends Animal and implements the Flyable interface, providing implementations for both makeSound() and fly() methods.
In the Main class, we create instances of Dog, Bird, and Parrot and call their methods to demonstrate abstraction.
parrot uses regular method sleep() from Animal Class
Bird cannot fly because it does not implement the Flyable interface */