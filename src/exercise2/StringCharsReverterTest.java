package exercise2;

import java.util.Scanner;

public class StringCharsReverterTest {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringCharsReverter s = new StringCharsReverter();
        System.out.println("Enter a message to reverse");
        String message = sc.nextLine();
        s.ReverseChars(message);
        System.out.println(s.GetReversedString());
        sc.close();
    }
}
