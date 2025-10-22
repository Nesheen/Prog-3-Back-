package entity.mapper;


import entity.Estudiante;
import entity.dto.estudiante.EstudianteCreate;
import entity.dto.estudiante.EstudianteDto;
import org.springframework.stereotype.Component;

@Component
public class EstudianteMapper implements BaseMapper<Estudiante, EstudianteDto, EstudianteCreate> {
    @Override
    public Estudiante toEntity(EstudianteCreate estudianteCreate) {
        Estudiante e = new Estudiante();
        e.setNombre(estudianteCreate.nombre());
        e.setMatricula(String.valueOf(estudianteCreate.matricula()));
        return e;
    }

    @Override
    public EstudianteDto toDto(Estudiante estudiante) {
        return new EstudianteDto(estudiante.getId(), estudiante.getNombre(), estudiante.getMatricula());
    }
}



