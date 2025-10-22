package entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.HashSet;
import java.util.Set;

@Entity //el entity le dice a JPA que esta clase es una tabla
@NoArgsConstructor @AllArgsConstructor
@SuperBuilder
@Getter @Setter

public class Curso extends Base {
    private String nombre;

    //relación X cursos -> profesor
    @ManyToOne// un profe puede tener muchos cursos
    private Profesor profesor;


    //relación X a X con estudiantes
    @ManyToMany //un cursos puede tener muchos cursos y en viceversa
    @JoinTable(
            name="curso_estudiante",
            joinColumns = @JoinColumn(name="curso_id"),
            inverseJoinColumns = @JoinColumn(name="estudiante_id"))

    @Builder.Default
    private Set<Estudiante> estudiantes = new HashSet<>();
}
