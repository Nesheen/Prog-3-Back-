package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("P001", "Java Básico", 25.5, "Ana Pérez");
        Producto p2 = new Producto("P002", "Python Avanzado", 30.0, "Carlos López");

        ProductoDTO dto1 = new ProductoDTO();
        ProductoDTO dto2 = new ProductoDTO();

        dto1.setCodigo("D111");
        dto2.setCodigo("H777");
        dto1.setPrecio(30.0);
        dto2.setPrecio(40.0);
        dto1.setNombre("Marcos Gutierrez");
        dto2.setNombre("Juan Casta");

        ArrayList<ProductoDTO>dtos= new ArrayList<>();

        dtos.add(dto1);
        dtos.add(dto2);

        System.out.println(p1);
        System.out.println(p2);

        for (ProductoDTO prods : dtos){
            System.out.println(prods);
        }
    }
}

/*
Crear una clase Producto con atributos codigo, nombre, precio y autor.
Crear una clase ProductoDTO con atributos codigo, nombre y precio:
1. Implementar constructores y getters/setters manualmente.
2. Crear varios objetos ProductoDTO y Producto
3. Cargar los objetos ProductoDTO usando getters y setters, luego guardarlos en una lista.
4. Mostrar la lista en consola.
* */