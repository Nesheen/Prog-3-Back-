package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno>alumnos = new ArrayList<>();

        Alumno alumno1 = new Alumno("Pepe Sanchez",7);
        Alumno alumno2 = new Alumno("Jose Gutierrez",8);
        Alumno alumno3 = new Alumno("Franco Ibañez",9);
        Alumno alumno4 = new Alumno("Pepe Sanchez",7);

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);


        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }
    }
}