package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Caja<String> cajaString = new Caja<>("Hola");
        Caja<Integer> cajaInteger = new Caja<>(123);

        cajaString.print();
        cajaInteger.print();

        List lista = new ArrayList();
        lista.add(cajaString);
        lista.add(cajaInteger);

        for(Object obj :lista){
            System.out.println("Elemento"+ obj);
        }


        List<String> listaGenerica = new ArrayList<>();
        listaGenerica.add("Hola");
        System.out.println("\nLista genérica: " + listaGenerica);
    }
}