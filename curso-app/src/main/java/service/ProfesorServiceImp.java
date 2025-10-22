package service;

import entity.Base;
import entity.Profesor;
import entity.dto.profesor.ProfesorCreate;
import entity.dto.profesor.ProfesorDto;

public class ProfesorServiceImp extends BaseServiceImp<Profesor, ProfesorDto, ProfesorCreate,Long> implements ProfesorService{
    @Override
    public void addEstudiante(Long idCurso, Long idEstudiante) {

    }
}
