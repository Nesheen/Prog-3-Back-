package controller;

import entity.dto.curso.CursoCreate;
import entity.dto.curso.CursoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CursoService;

@RestController
@CrossOrigin("*")
@RequestMapping("curso")
public class CursoController extends BaseController<CursoDto, CursoCreate,Long> {

    @Autowired
    CursoService cursoService;

    @PutMapping("addEstudiante/{idCurso}/{idEstudiante}")
    public ResponseEntity<?> addEstudiante(@PathVariable Long idCurso, @PathVariable Long idEstudiante){
        try{
            cursoService.addEstudiante(idCurso,idEstudiante);
            return ResponseEntity.ok("Estudiante agregado con exito");}catch (Exception e ){
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Ocurrio un error del tipo " + e.getClass() + " \nMensaje: " + e.getMessage());

        }
    }
}
