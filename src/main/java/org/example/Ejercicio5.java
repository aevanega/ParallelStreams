package org.example;

import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {
    public static class Persona {
        private final String nombre;
        private final int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }
    }

    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Andres", 25),
                new Persona("Juliana", 30),
                new Persona("Maria", 35),
                new Persona("Isabella", 28)
        );

        int totalEdad = personas.parallelStream()
                .map(Persona::getEdad)
                .reduce(0, Integer::sum);

        System.out.println("Total edad: " + totalEdad);
    }
}
