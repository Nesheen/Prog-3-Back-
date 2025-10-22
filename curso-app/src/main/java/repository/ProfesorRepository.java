package repository;

import entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //indica que son componentes de la BD
public interface ProfesorRepository extends JpaRepository<Profesor,Long> {
}

