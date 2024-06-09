package streams;

import java.util.Arrays;
import java.util.List;

public class FindFirstA {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("pineapple", "banana", "apple", "cherry", "date", "apricot");
        String result = words.stream().filter(str -> str.startsWith("a")).findFirst().orElse(null);
        System.out.println(result);
    }
}
