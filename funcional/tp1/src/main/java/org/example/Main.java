package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Ana", 8.5, "Matemáticas"),
                new Alumno("Luis", 6.0, "Historia"),
                new Alumno("Marta", 9.0, "Matemáticas"),
                new Alumno("Pedro", 7.0, "Historia")
        );

        // nombre de alumnos en mayúscula y ordenados
        System.out.println("Alumnos aprobados en mayúsculas y ordenados:");
        alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .forEach(System.out::println);

        // promedio gral
        double promedio = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0);
        System.out.println("\nPromedio general: " + promedio);

        // agrupar por curso
        System.out.println("\nAlumnos agrupados por curso:");
        Map<String, List<Alumno>> agrupados = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));
        agrupados.forEach((curso, lista) -> {
            System.out.println(curso + ": " + lista);
        });

        // mejores promedios
        System.out.println("\nTop 3 mejores notas:");
        alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
}
