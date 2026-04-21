package easy;

import java.util.*;

public class SortNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,1,8,3,2,10);

        List<Integer> asc = numbers.stream()
                .sorted()
                .toList();

        List<Integer> desc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Ascending: " + asc);
        System.out.println("Descending: " + desc);
    }
}
