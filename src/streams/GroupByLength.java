package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "world", "java", "streams", "code");
        //Map<Integer, List<String>> grouped = words.stream().sorted().collect(Collectors.groupingBy(String::length));

        // Grouping by length
        Map<Integer, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(String::length));

        // Printing the grouped map with a formatted output
        grouped.forEach((length, group) ->
                System.out.println(String.format("Length %d: %s", length, group))
        );


    }
}
