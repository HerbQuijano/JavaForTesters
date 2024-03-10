package exercise1;

public class StringReverter {

    public String RevertString(String s) {
        String reversed = "";

        if (s.isEmpty() || s.length() < 1) {
            reversed = "Empty String";
        } else {
            String[] splitString = s.split("");
            for (int i = splitString.length - 1; i >= 0; i--) {
                reversed = reversed + splitString[i];
            }
            
        }
        return reversed;
    }
}