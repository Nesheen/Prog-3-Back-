package org.example;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String saludar(){
        return "Hola";
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
/*
* Crea una clase Persona con atributos nombre y edad en privado.
* Desarrolle un método Saludar que devuelva un “Hola”.
*Usando Reflection: ● Obtén e imprime sus constructores. ● Instancia un objeto utilizando reflection.
*● Modifica el valor de nombre en tiempo de ejecución. ● Invoca un método que muestre la información de la persona.
*● Modifica el encapsulamiento de Saludar() hacia private usando reflection.
*                                                                                                                                                                                                                                                     */
