package service;

import entity.Curso;
import entity.dto.curso.CursoCreate;
import entity.dto.curso.CursoDto;

public interface CursoService extends  BaseService<CursoDto, CursoCreate, Long> {
    void addEstudiante(Long idCurso,Long idEstudiante);
}