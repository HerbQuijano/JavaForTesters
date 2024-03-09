package inheritance;

public class InheritanceDemo {
    
    public static void main(String[] args) {
        Car bmw = new Car(180, 75, true, 6, 4, "BMW", "M3", "Black");
        Car benz = new Car(120, 30, false, 2, 6, "Benz", "4b", "Blue");
        Bike bentley = new Bike(100, 100, 4, true, "Test", "Test", "White"); 

        System.out.println(bmw);
        System.out.println(benz);
        System.out.println(bentley);
    }

}
