package methodoverriding;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Output: Animal makes a sound

        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Dog barks

        Animal myCat = new Cat();
        myCat.makeSound(); // Output: Cat meows
    }
}

/* The Animal class has a method makeSound() that prints a generic message.
The Dog and Cat classes both extend the Animal class and override the makeSound() method to provide their own specific implementations.
In the Main class, we create instances of Animal, Dog, and Cat and call their makeSound() methods. The overridden methods in the Dog and Cat classes are called instead of the method in the Animal class. */