package edu.elp.siselp.dao;

import edu.elp.siselp.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteDao extends JpaRepository<Estudiante,String> {


}
