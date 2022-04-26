package edu.elp.siselp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "administrativo")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Administrativo extends Persona{

    @Column(name="AreaLabor")
    private String AreaLabor;

    @Column(name="CodigoAdmin",length = 20, nullable = false)
    private String CodigoAdmin;


}
