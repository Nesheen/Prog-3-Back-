package service;

import entity.Base;
import entity.Curso;
import entity.Estudiante;
import entity.dto.curso.CursoDto;
import entity.dto.estudiante.EstudianteCreate;
import entity.dto.estudiante.EstudianteDto;

import java.util.List;

public interface EstudianteService extends BaseService<EstudianteDto, EstudianteCreate,Long> {
    void addCurso(Curso curso, Estudiante e);
    List<CursoDto> getCursosById(Long idEstudiante);
}
