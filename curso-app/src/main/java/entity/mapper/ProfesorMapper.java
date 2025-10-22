package entity.mapper;

import entity.Profesor;
import entity.dto.profesor.ProfesorCreate;
import entity.dto.profesor.ProfesorDto;
import org.springframework.stereotype.Component;
@Component
public class ProfesorMapper implements BaseMapper<Profesor, ProfesorDto, ProfesorCreate> {
    @Override
    public Profesor toEntity(ProfesorCreate profesorCreate) {
        Profesor p = new Profesor();
        p.setMail(profesorCreate.mail());
        p.setNombre(profesorCreate.nombre());
        return p;
    }

    @Override
    public ProfesorDto toDto(Profesor profesor) {
        ProfesorDto p = new ProfesorDto(profesor.getId(), profesor.getNombre(),profesor.getMail());
        return p;
    }
}
