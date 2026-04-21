package easy;

import java.util.*;

public class AnyDivisibleBy3 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,7,10,14);

        boolean result = numbers.stream()

                .anyMatch(n -> n % 3 == 0);

        System.out.println(result);
    }
}

// false
