package easy;

import java.util.*;

public class FirstGreaterThan10 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 7, 12, 5, 11, 20);

        int result = numbers.stream()

                .filter(n -> n > 10)

                // 🔥 Optional handling
                .findFirst()
                .orElse(-1);

        System.out.println(result);
    }
}

// 12