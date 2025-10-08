package org.example;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Consulta extends Base {

    private LocalDate fecha;
    private String diagnostico;

    //conexión a médico
    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

    //conexión a paciente
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;


    //constructor vacio (necesario para JPA)
    public Consulta(){}

    public Consulta(LocalDate fecha, String diagnostico,Medico medico, Paciente paciente) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.medico=medico;
        this.paciente=paciente;
    }

    //obtener al médico
    public Medico getMedico(){return medico;}

    //obtener al paciente


    public Paciente getPaciente() {
        return paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "fecha=" + fecha +
                ", diagnostico='" + diagnostico + '\'' +
                ", medico=" + medico +
                ", paciente=" + paciente +
                '}';
    }


}


