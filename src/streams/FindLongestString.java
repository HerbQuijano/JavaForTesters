package streams;

//Given a list of strings, find the longest string.
//Print the longest string or indicate if the list is empty.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindLongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "world", "java", "streams", "code", "wonderful");
        //String string =  words.stream().max(Comparator.comparingInt(String::length)).get();
        Optional string = words.stream().collect(Collectors.maxBy(Comparator.comparingInt(String::length)));

        if (string.isPresent()) {
            System.out.printf("The longest string is %s.", string.get());
        } else {
            System.out.println("No strings match with request");
        }
    }
}

