package org.example;

import java.util.List;
import java.util.ArrayList;

public class Main {
    //genericos
    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        //lista de enteros
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);

        //lista de cadenas
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Hola");
        listaCadenas.add("Mundo");
        listaCadenas.add("Genéricos");

        System.out.println("Lista de Enteros:");
        imprimirLista(listaEnteros);

        System.out.println("\nLista de Cadenas:");
        imprimirLista(listaCadenas);
    }
}
