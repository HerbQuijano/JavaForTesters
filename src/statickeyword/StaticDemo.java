package statickeyword;

public class StaticDemo {
    private String make;
    private static int instanceNum = 0; // Add or Remove Static keyword to demonstrate static keyword usage, static means the attribute is attached to class instance, not object instance

    public StaticDemo(String make)
    {
        this.make = make;
        instanceNum++;
    }

    public String getMake(){
        return make;
    }

    //public int getInstanceNum(){
    public static int getInstanceNum(){ // Adding static to method, allow for call directly from the class without instantiating an object
        return instanceNum;
    }

}
