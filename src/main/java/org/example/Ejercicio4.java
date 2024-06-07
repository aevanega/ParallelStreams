package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Suma de números
        List<Integer> numbers = IntStream.rangeClosed(1, 50).boxed().collect(Collectors.toList());
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum);

        // Concatenación de cadenas
        List<String> strings = Arrays.asList("Banco", "Colombia", "Andres", "Vanegas", "Java");
        Optional<String> concatenatedString = strings.stream().reduce(String::concat);
        System.out.println("Concatenated string: " + concatenatedString.orElse(""));
    }
}
