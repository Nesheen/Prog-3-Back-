package service;

import entity.Curso;
import entity.dto.curso.CursoCreate;
import entity.dto.curso.CursoDto;
import org.springframework.beans.factory.annotation.Autowired;
import repository.EstudianteRepository;

public class CursoServiceImp extends BaseServiceImp<Curso, CursoDto, CursoCreate,Long> {
    @Autowired
    EstudianteRepository estudianteRepository;

    @Override
    public void addEstudiante(Long idCurso, Long idEstudiante){
        var c = baseRepository.getById(idCurso);
        var e = estudianteRepository.getById(idEstudiante);
        c.getEstudiantes().add(e);
        baseRepository.save(c);
        e.getCursos().add(c);
        estudianteRepository.save(e);

    }
}
