/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author AlexanderGuzman
 */
@Entity
@Table(name = "direccion")
public class direccionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDireccion;
    private String dir_numeCasa;
    private String dir_calle;
    private String dir_calle_sec;
    private String dir_sector;
    private String dir_provincia;
    private String dir_pais;

//    @OneToOne
//    @JoinColumn(name = "idPersona")
    @OneToOne(mappedBy = "direccion")
    private personaModel persona;

    public Long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getDir_numeCasa() {
        return dir_numeCasa;
    }

    public void setDir_numeCasa(String dir_numeCasa) {
        this.dir_numeCasa = dir_numeCasa;
    }

    public String getDir_calle() {
        return dir_calle;
    }

    public void setDir_calle(String dir_calle) {
        this.dir_calle = dir_calle;
    }

    public String getDir_calle_sec() {
        return dir_calle_sec;
    }

    public void setDir_calle_sec(String dir_calle_sec) {
        this.dir_calle_sec = dir_calle_sec;
    }

    public String getDir_sector() {
        return dir_sector;
    }

    public void setDir_sector(String dir_sector) {
        this.dir_sector = dir_sector;
    }

    public String getDir_provincia() {
        return dir_provincia;
    }

    public void setDir_provincia(String dir_provincia) {
        this.dir_provincia = dir_provincia;
    }

    public String getDir_pais() {
        return dir_pais;
    }

    public void setDir_pais(String dir_pais) {
        this.dir_pais = dir_pais;
    }

//    public personaModel getPersona() {
//        return persona;
//    }
//
//    public void setPersona(personaModel persona) {
//        this.persona = persona;
//    }

}
