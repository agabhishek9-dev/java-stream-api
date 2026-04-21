package easy;

import java.util.*;

public class SquareEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        List<Integer> result = numbers.stream()

                .filter(n -> n % 2 == 0) // even
                .map(n -> n * n)         // square

                .toList();

        System.out.println(result);
    }
}
// [4, 16, 36]