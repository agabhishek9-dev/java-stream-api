package difficult;

import java.util.*;

public class LongestWordFinder {

    public static void main(String[] args) {

        String sentence = "The quick, brown fox jumped over the lazy dog!";

        String result = Arrays.stream(
                        sentence.toLowerCase()

                                // 🔥 Remove punctuation
                                .replaceAll("[^a-z\\s]", "")

                                .split(" ")
                )

                // 🔥 Find longest
                .max(Comparator.comparing(String::length))
                .orElse("");

        System.out.println(result);
    }
}
// jumped
