package easy;

import java.util.*;

public class MaxNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 2, 8, 20);

        int max = numbers.stream()

                .reduce(Integer.MIN_VALUE, Integer::max);

        System.out.println(max);
    }
}

// 20
