package org.example;

import java.util.ArrayList;

// 1. Defina la clase Producto con atributos codigo, nombre y precio.
//2. Sobrescriba equals() para que dos productos se consideren iguales si tienen el mismo codigo.
//3. Crear una lista de productos y evitar duplicados usando contains().
public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos =new ArrayList<>();

        Producto prod1 = new Producto(1234,"Celular",12000);
        Producto prod2 = new Producto(1234,"Celular",12000);
        Producto prod3 = new Producto(5432,"Parlante",5000);
        Producto prod4 = new Producto(9823,"Thinkpad",50000);


        if (!productos.contains(prod1)){
            productos.add(prod1);}

        if (!productos.contains(prod2)){
            productos.add(prod2);}

        if (!productos.contains(prod3)){
            productos.add(prod3);}

        if (!productos.contains(prod4)){
            productos.add(prod4);}


        for (Producto prod :productos){
           System.out.println(prod.getCodigo() + "\n" + prod.getNombre() + "\n") ;
       }



    }
}