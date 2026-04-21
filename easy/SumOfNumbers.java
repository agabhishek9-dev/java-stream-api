package easy;

import java.util.*;

public class SumOfNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream()

                // identity = 0 for sum
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}

// 15
