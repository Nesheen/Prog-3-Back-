package repository;

import entity.Curso;
import entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    //retorna todos los cursos del estudiante
    @Query("SELECT e.cursos FROM Estudiante e WHERE e.id= :id")
    List<Curso> findCursosById(Long id);
}
