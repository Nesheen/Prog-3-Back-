package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet <Producto>productos= new HashSet<>();

        Producto producto1 =  new Producto("AF123","Colchon denso");
        Producto producto2 =  new Producto("GE275","Televisor LG");
        Producto producto3 =  new Producto("HK777","Celular Samsung");
        Producto producto4 =  new Producto("NO421","Computadora lenovo");
        Producto producto5 =  new Producto("GE275","Televisor LG");
        Producto producto6 =  new Producto("NO421","Computadora lenovo");
        Producto producto7 =  new Producto("NO421","Computadora lenovo");

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);

        for(Producto i : productos){
            System.out.println(i);
        }


    }
}