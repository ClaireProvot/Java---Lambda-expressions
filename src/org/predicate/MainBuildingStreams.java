package org.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainBuildingStreams {

    public static void main (String[] args) {

        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);

        Stream<Integer> stream1 = ints.stream();
        Stream<Integer> stream = Stream.of(0, 1, 2, 3, 4);

        stream.forEach(System.out::println);

        Stream<String> streamOfString = Stream.generate(() -> "one");
        streamOfString.limit(5).forEach(System.out::println);

        Stream<String> streamOfString2 = Stream.iterate("+", s -> s + "+");
        streamOfString2.limit(5).forEach(System.out::println);

        // stream on random number
        IntStream streamOfInt = ThreadLocalRandom.current().ints();
        streamOfInt.limit(5).forEach(System.out::println);
    }
}
