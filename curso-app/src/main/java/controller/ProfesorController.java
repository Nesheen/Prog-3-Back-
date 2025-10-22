package controller;

import entity.dto.profesor.ProfesorCreate;
import entity.dto.profesor.ProfesorDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("profesor")
public class ProfesorController extends BaseController<ProfesorDto, ProfesorCreate,Long> {
}
