package edu.elp.siselp.service;

import edu.elp.siselp.entity.Docente;

import java.util.List;

public interface IDocenteService {

    List<Docente> listaDocente();
    Docente obtenerDocenteBycodDocente(String codDocente);
}
