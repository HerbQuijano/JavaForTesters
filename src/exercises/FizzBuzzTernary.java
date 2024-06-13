package exercises;

public class FizzBuzzTernary {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String result = (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" :
                    (i % 3 == 0) ? "Fizz" :
                            (i % 5 == 0) ? "Buzz" :
                                    Integer.toString(i);
            System.out.println(result);
        }
    }
}