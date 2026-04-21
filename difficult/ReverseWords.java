package difficult;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseWords {

    public static void main(String[] args) {

        String sentence = "Java streams are powerful";

        String result = Arrays.stream(sentence.split(" "))

                // 🔥 Reverse each word
                .map(word -> new StringBuilder(word).reverse().toString())

                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}

// avaJ smaerts era lufrewop

//Alternative Way
//
//        .map(word ->
//        Arrays.stream(word.split(""))
//        .reduce("", (rev, ch) -> ch + rev)
//        )
