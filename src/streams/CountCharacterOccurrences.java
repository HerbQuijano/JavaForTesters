package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        char targetChar = 'a';

        long count = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .filter(c -> c == targetChar)
                .count();
        System.out.println(count);

    }
}
