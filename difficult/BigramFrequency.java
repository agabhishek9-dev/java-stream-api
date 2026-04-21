package difficult;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigramFrequency {

    public static void main(String[] args) {

        String paragraph = "Java is great and Java is fun Java is powerful";

        String[] words = paragraph.toLowerCase()
                .replaceAll("[^a-z\\s]", "")
                .split(" ");

        List<String> pairs = IntStream.range(0, words.length - 1)

                // 🔥 Create pairs
                .mapToObj(i -> words[i] + " " + words[i + 1])

                .toList();

        Map<String, Long> result = pairs.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(result);
    }
}
