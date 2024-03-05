package statickeyword;

public class StaticDemoTest {
    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo("Ford");
        System.out.println("Make: " + s1.getMake());
        //System.out.println("Instance Number: " + s1.getInstanceNum());
        System.out.println("Make: " + StaticDemo.getInstanceNum());

        StaticDemo s2 = new StaticDemo("Honda");
        System.out.println("Make: " + s2.getMake());
        //System.out.println("Instance Number: " + s2.getInstanceNum());
        System.out.println("Make: " + StaticDemo.getInstanceNum()); // Since the method is static, it can be called directly from the class without instantiating an object
    }

}
