package edu.elp.siselp.service.impl;

import edu.elp.siselp.dao.IAdministrativoDao;
import edu.elp.siselp.entity.Administrativo;
import edu.elp.siselp.service.IAdministrativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdministrativoServiceImpl implements IAdministrativoService {


    @Autowired
    private IAdministrativoDao administrativoDao;


    @Override
    public List<Administrativo> listaAdministrativos() {
List<Administrativo> administrativoList=this.administrativoDao.findAll();
for (Administrativo administrativo:administrativoList){
    System.out.println(administrativo.toString());
}


        return this.administrativoDao.findAll();
    }

    @Override
    public Administrativo obtenerPersonaByAreaLabor(String arealabor) {
        return null;
    }
}
