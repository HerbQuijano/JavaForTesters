package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpper {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        List<String> transformedWords = words.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(transformedWords);
    }
}
