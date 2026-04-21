package intermediate;//🚀 1. Second Highest Number

import java.util.*;

public class SecondHighest {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);

        int result = numbers.stream()
                .distinct() // handle duplicates
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println("Second Highest: " + result);
    }
}