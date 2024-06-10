package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println(words.stream().collect(Collectors.joining(", ")));

    }
}
