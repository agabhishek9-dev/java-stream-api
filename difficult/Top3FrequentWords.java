package difficult;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top3FrequentWords {

    public static void main(String[] args) {

        String paragraph = "Java is great Java is powerful Java is fun";

        Map<String, Long> freq = Arrays.stream(
                        paragraph.toLowerCase()
                                .replaceAll("[^a-z\\s]", "")
                                .split(" ")
                )
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        List<Map.Entry<String, Long>> result = freq.entrySet().stream()

                // 🔥 Sort descending
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())

                // 🔥 Top 3
                .limit(3)

                .toList();

        System.out.println(result);
    }
}

// [java=3, is=3, great=1]

// Get top frequencies only (Alternative Way)

//List<Long> topFreq = freq.values().stream()
//        .distinct()
//        .sorted(Comparator.reverseOrder())
//        .limit(3)
//        .toList();
