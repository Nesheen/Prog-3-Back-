package org.example;

public class Main {
    public static void main(String[] args) {

        //constructor sobrecargado
        Persona persona1 = new Persona("German Garmendia",40);
        System.out.println(persona1);

        //constructor vacio
        Persona persona2 = new Persona();
        persona2.setEdad(20);
        persona2.setPersona("Carlos Perez");
        System.out.println(persona2);

    }
}