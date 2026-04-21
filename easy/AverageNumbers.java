package easy;

import java.util.*;

public class AverageNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,10,15,20,25);

        double avg = numbers.stream()

                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(avg);
    }
}

// 15.0
