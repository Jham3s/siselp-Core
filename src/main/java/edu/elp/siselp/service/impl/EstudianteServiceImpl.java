package edu.elp.siselp.service.impl;

import edu.elp.siselp.dao.IEstudianteDao;
import edu.elp.siselp.entity.Estudiante;
import edu.elp.siselp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

@Autowired
private IEstudianteDao estudianteDao;


    @Override
    public List<Estudiante> listaEstudiantes() {

        List<Estudiante> estudianteList =this.estudianteDao.findAll();

        for (Estudiante estudiante:estudianteList){
            System.out.println(estudiante.toString());
        }
        return this.estudianteDao.findAll();
    }

    @Override
    public Estudiante obtenerEstudianteByCodigo(String codigo) {
        return null;
    }
}
