package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        //obtener la clase y asignarla
        Class<?> clasePersona= Persona.class;

        //obtener e imprimir constructores
        System.out.println("Constructores de persona");
        Constructor<?>[] constructores = clasePersona.getDeclaredConstructors();
        for (Constructor<?> c : constructores) {
            System.out.println(c);
        }

        //instanciar objetos usando reflection
        Constructor<?> constructor = clasePersona.getConstructor(String.class,int.class);
        Object persona = constructor.newInstance("Pedro",25);
        System.out.println("Objeto creado:"+ persona);

        //modifiar el valor de nombre
        Field campoNombre= clasePersona.getDeclaredField("nombre");
        System.out.println("Nombre nuevo:"+ persona);

        //metodo que muestra info de persona
        Method metodoToString = clasePersona.getMethod("toString");
        String info = (String) metodoToString.invoke(persona);
        System.out.println("\nInvocando toString con reflection:");
        System.out.println(info);

        // llamar al mwtodo Saludar()
        Method metodoSaludar = clasePersona.getMethod("saludar");
        System.out.println("\nInvocando saludar:");
        System.out.println(metodoSaludar.invoke(persona));

        // modificar encapsulamiento de Saludar() hacia private
        Method metodoSaludarPrivado = clasePersona.getDeclaredMethod("saludar");
        System.out.println("\nModificador original de saludar(): "
                + Modifier.toString(metodoSaludarPrivado.getModifiers()));


        metodoSaludarPrivado.setAccessible(false);

        try {
            System.out.println(metodoSaludarPrivado.invoke(persona));
        } catch (IllegalAccessException e) {
            System.out.println("No se puede acceder a saludar(), simula ser privado.");
        }
    }
}



