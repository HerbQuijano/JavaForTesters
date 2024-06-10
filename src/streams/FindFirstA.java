package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstA {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("pineapple", "banana", "apple", "cherry", "date", "apricot");
        Optional<String> result = words.stream().filter(str -> str.startsWith("a")).findFirst();

        if (result.isPresent()) {
            System.out.println("The first word that starts with 'A' is: " + result.get());
        }
        else {
            System.out.println("No word starts with 'A' in the list.");
        }
    }
}
