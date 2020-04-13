/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author AlexanderGuzman
 */
@Entity
@Table(name = "subservicio")
public class subservicioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSubservicio;
    private String servi_nombre;
    private double servi_precio;
    @ManyToOne
    @JoinColumn(name = "idServicio")
    private servicioModel servicio;
    @ManyToOne
    @JoinColumn(name = "idJardinesModelos")
    private jardinesModelosModel jardinesmodelos;
    
    @OneToMany(mappedBy = "subservicio")
    private List<peticionServicioModel> peticionservicio;

    public Long getIdSubservicio() {
        return idSubservicio;
    }

    public void setIdSubservicio(Long idSubservicio) {
        this.idSubservicio = idSubservicio;
    }

    public String getServi_nombre() {
        return servi_nombre;
    }

    public void setServi_nombre(String servi_nombre) {
        this.servi_nombre = servi_nombre;
    }

    public double getServi_precio() {
        return servi_precio;
    }

    public void setServi_precio(double servi_precio) {
        this.servi_precio = servi_precio;
    }

    public servicioModel getServicio() {
        return servicio;
    }

    public void setServicio(servicioModel servicio) {
        this.servicio = servicio;
    }

    public jardinesModelosModel getJardinesmodelos() {
        return jardinesmodelos;
    }

    public void setJardinesmodelos(jardinesModelosModel jardinesmodelos) {
        this.jardinesmodelos = jardinesmodelos;
    }

}
