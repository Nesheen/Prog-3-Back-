package entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor @AllArgsConstructor
@SuperBuilder
@Getter @Setter

public class Estudiante extends Base {
    private String nombre;
    private String matricula;

    //X estudiantes pueden tener X cursos
    @ManyToMany(mappedBy = "estudiantes")
    @Builder.Default
    Set<Curso> cursos = new HashSet<>();

}
