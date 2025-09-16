package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Laptop", "Electrónica", 1500, 10),
                new Producto("Mouse", "Electrónica", 50, 200),
                new Producto("Teclado", "Electrónica", 120, 150),
                new Producto("Mesa", "Muebles", 300, 20),
                new Producto("Silla", "Muebles", 80, 50),
                new Producto("Cuaderno", "Papelería", 30, 500),
                new Producto("Calculadora", "Papelería", 110, 80)
        );

        // lista de productos
        System.out.println("Productos con precio > 100, ordenados por precio descendente:");
        productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .forEach(System.out::println);

        // agrupar productos y calcular stock
        System.out.println("\nStock total por categoría:");
        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)
                ));
        stockPorCategoria.forEach((categoria, totalStock) ->
                System.out.println(categoria + ": " + totalStock));

        // string con nombre y precio
        String productosString = productos.stream()
                .map(p -> p.getNombre() + " $" + p.getPrecio())
                .collect(Collectors.joining("; "));
        System.out.println("\nProductos en formato String:");
        System.out.println(productosString);

        // promedio gral
        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0);
        System.out.println("\nPrecio promedio general: " + promedioGeneral);

        // Precio promedio por categoría
        System.out.println("\nPrecio promedio por categoría:");
        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)
                ));
        promedioPorCategoria.forEach((categoria, promedio) ->
                System.out.println(categoria + ": " + promedio));
    }
}
