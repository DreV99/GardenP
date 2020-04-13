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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author AlexanderGuzman
 */
@Entity
@Table(name = "peticionservicio")
public class peticionServicioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPeticionServicio;
    private String ancho_pet;
    private String largo_pet;
    private double total_pet;
    @ManyToOne
   @JoinColumn(name = "idPeticiones")
    private peticionesModel peticiones;
    @ManyToOne
    @JoinColumn(name = "idSubservicio")
    private subservicioModel subservicio;

    public Long getIdPeticionServicio() {
        return idPeticionServicio;
    }

    public void setIdPeticionServicio(Long idPeticionServicio) {
        this.idPeticionServicio = idPeticionServicio;
    }

    public String getAncho_pet() {
        return ancho_pet;
    }

    public void setAncho_pet(String ancho_pet) {
        this.ancho_pet = ancho_pet;
    }

    public String getLargo_pet() {
        return largo_pet;
    }

    public void setLargo_pet(String largo_pet) {
        this.largo_pet = largo_pet;
    }

    public double getTotal_pet() {
        return total_pet;
    }

    public void setTotal_pet(double total_pet) {
        this.total_pet = total_pet;
    }

    public peticionesModel getPeticiones() {
        return peticiones;
    }

    public void setPeticiones(peticionesModel peticiones) {
        this.peticiones = peticiones;
    }



    public subservicioModel getSubservicio() {
        return subservicio;
    }

    public void setSubservicio(subservicioModel subservicio) {
        this.subservicio = subservicio;
    }

 
}
