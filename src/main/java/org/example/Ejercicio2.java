package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new Random().ints(200, 0, 100).boxed().collect(Collectors.toList());

        //parallelStream
        double parallelSum = randomNumbers.parallelStream().mapToInt(Integer::intValue).sum();
        double parallelAverage = randomNumbers.parallelStream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Parallel Stream - Suma: " + parallelSum + ", Promedio: " + parallelAverage);

        //stream
        double sequentialSum = randomNumbers.stream().mapToInt(Integer::intValue).sum();
        double sequentialAverage = randomNumbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Stream - Suma: " + sequentialSum + ", Promedio: " + sequentialAverage);
    }
}
