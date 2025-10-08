package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class Paciente extends Base{
    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;
    private String obraSocial;
    private LocalDate fechaNacimiento;
    private char sexo;

    @OneToMany(mappedBy = "paciente",cascade = CascadeType.ALL)
    private List<Consulta> consultas = new ArrayList<>();

    //conexion a Historial Clinica
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "historial_id") // la FK queda en paciente
    private HistorialClinica historialClinica;

    public Paciente( String nombre, String apellido, int edad, int DNI, String obraSocial, LocalDate fechaNacimiento, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.obraSocial = obraSocial;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
    public Paciente(){

    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", obraSocial='" + obraSocial + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo=" + sexo +
                '}';
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    private List<Medicamento> medicamentos = new ArrayList<>();

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }


    public void setMedicamentos(Medicamento medicamentos) {
        this.medicamentos= Collections.singletonList(medicamentos);
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public HistorialClinica getHistorialClinica() {
        return historialClinica;
    }

    public void setHistorialClinica(HistorialClinica historialClinica) {
        this.historialClinica = historialClinica;
    }
}
