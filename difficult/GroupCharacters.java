package difficult;

import java.util.*;
import java.util.stream.Collectors;

enum CharType { UPPERCASE, LOWERCASE, DIGIT, OTHER }

public class GroupCharacters {

    public static void main(String[] args) {

        List<Character> chars = Arrays.asList('A','b','3','Z','x','#','7','m','@');

        Map<CharType, List<Character>> result = chars.stream()
                .collect(Collectors.groupingBy(
                        ch -> getType(ch)
                ));

        System.out.println(result);
    }

    private static CharType getType(char c) {
        if (Character.isUpperCase(c)) return CharType.UPPERCASE;
        if (Character.isLowerCase(c)) return CharType.LOWERCASE;
        if (Character.isDigit(c)) return CharType.DIGIT;
        return CharType.OTHER;
    }
}
