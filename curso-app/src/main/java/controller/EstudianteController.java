package controller;

import entity.dto.estudiante.EstudianteCreate;
import entity.dto.estudiante.EstudianteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.EstudianteService;

@RestController
@RequestMapping("estudiante")
@CrossOrigin("*")
public class EstudianteController extends BaseController<EstudianteDto, EstudianteCreate, Long> {
    @Autowired
    EstudianteService estudianteService;

    @GetMapping("findCursos/{idEstudiante}")
    public ResponseEntity<?> findAll (@PathVariable Long idEstudiante){
        try{
            return ResponseEntity.ok(estudianteService.getCursosById(idEstudiante));}catch (Exception e){
            return ResponseEntity.badRequest().body("Ocurrio un error del tipo " + e.getClass() + " \nMensaje: " + e.getMessage());
        }
    }
}
