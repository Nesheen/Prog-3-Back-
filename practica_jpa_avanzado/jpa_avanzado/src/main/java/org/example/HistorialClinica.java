package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HistorialClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    public HistorialClinica() {}

    public HistorialClinica(String descripcion){
        this.descripcion = descripcion;
    }

    // Getter y setter
    public Long getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return "HistorialClinica{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
