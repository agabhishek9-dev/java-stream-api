package intermediate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrences {

    public static void main(String[] args) {

        List<String> items = Arrays.asList("apple","banana","apple","orange","banana");

        Map<String, Long> map = items.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println("Count: " + map);
    }
}