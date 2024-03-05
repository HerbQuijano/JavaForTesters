package exercise2;

public class StringCharsReverter {
    String reversed = "";

    public void ReverseChars(String string) {
        if (string == null || string.length() < 1 || string.isEmpty())
        {
            System.err.println("Empty String");
        }
        else {
        String[] array = string.split("");
        for (int i = array.length -1; i >= 0; i--){
            reversed = reversed + array[i];
        }
    }
    }

    public String GetReversedString() {
        return reversed;
    }

}
