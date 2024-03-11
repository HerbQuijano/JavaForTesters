package methodoverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling the add method with two integers
        System.out.println("Addition of 5 and 10: " + calculator.add(5, 10));

        // Calling the overloaded add method with three integers
        System.out.println("Addition of 5, 10, and 15: " + calculator.add(5, 10, 15));

        // Calling the overloaded add method with two doubles
        System.out.println("Addition of 5.5 and 10.5: " + calculator.add(5.5, 10.5));

        // Calling the overloaded add method with an array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Addition of an array of integers: " + calculator.add(numbers));
    }
}

/* The Calculator class has four overloaded add methods:
One that adds two integers.
One that adds three integers.
One that adds two doubles.
One that adds an array of integers.
Each add method has a different parameter list, which is what makes them overloaded.
In the Main class, we create an instance of Calculator and call each of the overloaded add methods to demonstrate method overloading. */