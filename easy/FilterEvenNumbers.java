package easy;

import java.util.*;
import java.util.stream.*;

public class FilterEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> result = numbers.stream()

                // 🔥 Keep only even numbers
                .filter(n -> n % 2 == 0)

                .toList();

        System.out.println(result);
    }
}

// [2, 4, 6, 8, 10]