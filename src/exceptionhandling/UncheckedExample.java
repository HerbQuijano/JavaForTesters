package exceptionhandling;

// Demonstrates handling an unchecked exception (ArithmeticException)
public class UncheckedExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }
}
