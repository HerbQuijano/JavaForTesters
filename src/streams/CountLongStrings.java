package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CountLongStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "world", "java", "streams");
        //List<String> result = words.stream().filter(string -> string.length() > 3).collect(Collectors.toList());
        long result = words.stream().filter(string -> string.length() > 3).count();
        System.out.println(String.format("There are %d strings that have more than 3 characters.", result));
    }
}
