package easy;

import java.util.*;

public class CountStartingWithA {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple","Banana","Avocado","Mango","Apricot");

        long count = fruits.stream()

                .filter(s -> s.startsWith("A"))

                .count();

        System.out.println(count);
    }
}

// 3
