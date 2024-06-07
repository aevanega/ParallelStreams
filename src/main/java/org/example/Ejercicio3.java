package org.example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

        // parallelStream
        Optional<Integer> parallelAnyEven = numbers.parallelStream().filter(n -> n % 2 == 0).findAny();
        System.out.println("Parallel Stream - findAny even number: " + parallelAnyEven.orElse(null));

        // stream
        Optional<Integer> sequentialAnyEven = numbers.stream().filter(n -> n % 2 == 0).findAny();
        System.out.println("Stream - findAny even number: " + sequentialAnyEven.orElse(null));
    }
}
