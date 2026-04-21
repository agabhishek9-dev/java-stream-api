package easy;

import java.util.*;

public class DistinctElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,2,8,2,3,5,9,3);

        List<Integer> result = numbers.stream()

                // 🔥 remove duplicates
                .distinct()

                .toList();

        System.out.println(result);
    }
}

// [5, 2, 8, 3, 9]