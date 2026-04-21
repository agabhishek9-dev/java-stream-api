package intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByLength {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple","bat","ball","cat","banana","dog","goat");

        Map<Integer, List<String>> result = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Grouped by Length: " + result);
    }
}