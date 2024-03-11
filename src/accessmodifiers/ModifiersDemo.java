package accessmodifiers;

public class ModifiersDemo {
    public static void main(String[] args) {
        Modifier m = new Modifier("John", 30, "Likes pineapple on pizza");

        // Accessing public field
        System.out.println("Name: " + m.name);

        // Accessing protected field (allowed because it's in the same package)
        System.out.println("Age: " + m.age);

        // Accessing private field (not directly accessible, so we use a public method)
        System.out.println("Secret: " + m.getSecret());

        // Uncommenting the line below will cause a compilation error because 'secret' is private
        //System.out.println(m.secret);
    }

}