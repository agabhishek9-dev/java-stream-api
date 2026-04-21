package easy;

import java.util.*;

public class SquareNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> result = numbers.stream()

                // 🔥 Transform each number
                .map(n -> n * n)

                .toList();

        System.out.println(result);
    }
}

// [1, 4, 9, 16, 25]