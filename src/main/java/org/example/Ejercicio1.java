package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

        numbers.parallelStream().forEach(number -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Numero: " + number + ", Hilo: " + threadName);
        });
    }
}