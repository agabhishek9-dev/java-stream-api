package easy;

import java.util.*;

public class AllPositive {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,10,3,8,2);

        boolean result = numbers.stream()

                .allMatch(n -> n > 0);

        System.out.println(result);
    }
}

// true
