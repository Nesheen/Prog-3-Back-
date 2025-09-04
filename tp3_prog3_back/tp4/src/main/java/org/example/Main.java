package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Producto prod1 = new Producto(1020,"Computadora",20000);
        Producto prod2 = new Producto(1000,"Mochila",1800);
        Producto prod3 = new Producto(1020,"Computadora",20000);

        System.out.println(prod1.equals(prod2));
        System.out.println(prod1.equals(prod3));

        Set<Producto>productos = new HashSet<>();
        productos.add(prod1);
        productos.add(prod2);
        productos.add(prod3);

        for (Producto p :productos){
            System.out.println(p);
        }
        



    }
}