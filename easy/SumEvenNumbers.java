package easy;

import java.util.*;

public class SumEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream()

                .filter(n -> n % 2 == 0)

                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}

// 6
