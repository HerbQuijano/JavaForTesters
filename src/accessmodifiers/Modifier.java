package accessmodifiers;

public class Modifier {
    public String name; // Public: Accessible from anywhere
    protected int age; // Protected: Accessible within the same package and by subclasses
    private String secret; // Private: Accessible only within the Modifier class

    public Modifier(String name, int age, String secret) {
        this.name = name;
        this.age = age;
        this.secret = secret;
    }

    public String getSecret() {
        return secret; // Accessing private field within the class
    }
            
}
