package org.example;

public class Medicamento {
    private String nombre;
    private String droga;
    private int pesoEnGramos;

    public Medicamento(String nombre, String droga, int pesoEnGramos) {
        this.nombre = nombre;
        this.droga = droga;
        this.pesoEnGramos = pesoEnGramos;
    }
    public Medicamento(){

    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", droga='" + droga + '\'' +
                ", pesoEnGramos=" + pesoEnGramos +
                '}';
    }
}
