package easy;

import java.util.*;
import java.util.stream.Collectors;

public class JoinStrings {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple","Banana","Mango","Orange");

        String result = fruits.stream()

                // 🔥 Join with delimiter
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}

// Apple, Banana, Mango, Orange
