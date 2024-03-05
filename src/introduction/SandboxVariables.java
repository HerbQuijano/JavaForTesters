package introduction;


public class SandboxVariables {
    static int num1; // class variable, no need to initialize but has to be static.
    
    public static void main(String[] args) {
        int num2 = 0; // If not a class variable, it has to be initialized.

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

    }
}
