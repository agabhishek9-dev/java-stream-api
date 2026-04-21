package easy;

import java.util.*;
import java.util.stream.*;

public class CreateStreams {

    public static void main(String[] args) {

        // 1️⃣ List → Stream
        List<String> names = Arrays.asList("alice", "bob");
        Stream<String> stream1 = names.stream();

        // 2️⃣ Array → Stream
        String[] arr = {"Java", "Python", "C++"};
        Stream<String> stream2 = Arrays.stream(arr);

        // 3️⃣ Stream.of()
        Stream<Integer> stream3 = Stream.of(1, 2, 3);

        // 4️⃣ Infinite Stream (limit required)
        Stream<Double> stream4 = Stream.generate(Math::random).limit(3);

        stream4.forEach(System.out::println);
    }
}
