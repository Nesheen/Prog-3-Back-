package entity.mapper;

import entity.Curso;
import entity.dto.curso.CursoCreate;
import entity.dto.curso.CursoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.ProfesorRepository;

@Component
public class CursoMapper implements BaseMapper<Curso, CursoDto, CursoCreate> {

    @Autowired
    private ProfesorMapper profesorMapper;
    @Autowired
    private ProfesorRepository profesorRepository;
    @Autowired
    private EstudianteMapper estudianteMapper;

    @Override
    public Curso toEntity(CursoCreate cursoCreate) {
        Curso c = new Curso();
        c.setNombre(cursoCreate.nombre());
        c.setProfesor(profesorRepository.getById(cursoCreate.profesorId()));
        return c;
    }

    @Override
    public CursoDto toDto(Curso curso) {
        return new CursoDto(
                curso.getId(),
                curso.getNombre(),
                profesorMapper.toDto(curso.getProfesor()),
                curso.getEstudiantes().stream().map(estudianteMapper::toDto).toList());
    }
}
