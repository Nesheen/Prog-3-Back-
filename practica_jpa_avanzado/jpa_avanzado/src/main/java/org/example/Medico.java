package org.example;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Medico extends Base {

    private String nombre;
    private String apellido;
    private int edad;
    private String especialidad;
    private String matricula;


    // Un médico puede tener x cantidad de consultas
    @Getter
    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    private List<Consulta> consultas = new ArrayList<>();

    public Medico() {}

    public Medico(String nombre, String apellido, int edad, String especialidad, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.especialidad = especialidad;
        this.matricula = matricula;
    }

    //name del medico
    public String getNombre() { return nombre; }

    //apellido del medico
    public String getApellido() { return apellido; }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
