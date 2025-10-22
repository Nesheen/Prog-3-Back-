package entity.dto.curso;

import entity.dto.estudiante.EstudianteDto;
import entity.dto.profesor.ProfesorDto;

import java.util.List;

public record CursoDto(Long id,
                       String nombre,
                       ProfesorDto profesor,
                       List<EstudianteDto> estudiantes) {
}
