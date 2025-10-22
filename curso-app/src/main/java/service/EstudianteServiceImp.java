package service;

import entity.Curso;
import entity.Estudiante;
import entity.dto.curso.CursoDto;
import entity.dto.estudiante.EstudianteCreate;
import entity.dto.estudiante.EstudianteDto;
import entity.mapper.CursoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EstudianteRepository;

import java.util.List;

@Service
public class EstudianteServiceImp extends BaseServiceImp<Estudiante, EstudianteDto, EstudianteCreate,Long> implements EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;
    @Autowired
    CursoMapper cursoMapper;

    @Override
    public void addCurso(Curso curso, Estudiante e) {
        e.getCursos().add(curso);
        baseRepository.save(e);
    }

    @Override
    public List<CursoDto> getCursosById(Long idEstudiante) {
        return estudianteRepository.findCursosById(idEstudiante).stream().map(cursoMapper::toDto).toList();
    }

    @Override
    public void addEstudiante(Long idCurso, Long idEstudiante) {

    }
}
