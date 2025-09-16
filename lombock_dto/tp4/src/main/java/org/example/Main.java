package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Producto prod1 = new Producto("P001", "Laptop", "ProveedorA", 1200.50);
        Producto prod2 = new Producto("P002", "Mouse", "ProveedorB", 25.99);

        ProductoRecord prodRed1 = new ProductoRecord("K001","Teclado",8321);
        ProductoRecord prodRed2 = new ProductoRecord("K002","Monitor",3121);

        List<Producto> productos = new ArrayList<Producto>();
        productos.add(prod1);
        productos.add(prod2);

        for(Producto prod :productos){
            System.out.println(prod);
        }

        System.out.println("");

        List<ProductoRecord>prodRecords = new ArrayList<>();
        prodRecords.add(prodRed1);
        prodRecords.add(prodRed2);

        for (ProductoRecord prod : prodRecords){
            System.out.println(prod);
        }

    }
}
/*
Crear una Clase Producto (String codigo, String nombre, String proveedor, double precio)
Crear un record ProductoRecord(String codigo, String nombre, double precio):
1. Instanciar varios ProductoRecord y Producto.
2. Instanciar los ProdcutoRecord con los Objetos Producto.
3. Guardarlos en una lista.
4. Mostrar los productos en consola.
* */