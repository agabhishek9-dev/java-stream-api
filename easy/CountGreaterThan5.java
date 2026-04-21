package easy;

import java.util.*;

public class CountGreaterThan5 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 6, 3, 8, 10, 1);

        long count = numbers.stream()

                .filter(n -> n > 5)

                .count();

        System.out.println(count);
    }
}
// 3
