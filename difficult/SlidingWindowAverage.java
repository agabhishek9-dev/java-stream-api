package difficult;

import java.util.*;
import java.util.stream.IntStream;

public class SlidingWindowAverage {

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(5,10,15,20,25,30);
        int window = 3;

        List<Double> result = IntStream.range(0, input.size() - window + 1)

                // 🔥 Create sublists
                .mapToObj(i -> input.subList(i, i + window))

                // 🔥 Compute avg for each window
                .map(list -> list.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0)
                )

                .toList();

        System.out.println(result);
    }
}

// [10.0, 15.0, 20.0, 25.0]
