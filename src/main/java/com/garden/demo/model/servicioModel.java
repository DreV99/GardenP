/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author AlexanderGuzman
 */
@Entity
@Table(name = "servicio")

public class servicioModel {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long idServicio;
//    private String tip_servicio;
//    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
//    private List<empleadoServicio> empleadoServ = new ArrayList<>();
//
//    public Long getIdServicio() {
//        return idServicio;
//    }
//
//    public void setIdServicio(Long idServicio) {
//        this.idServicio = idServicio;
//    }
//
//    public String getTip_servicio() {
//        return tip_servicio;
//    }
//
//    public void setTip_servicio(String tip_servicio) {
//        this.tip_servicio = tip_servicio;
//    }
//
//    @Override
//    public String toString() {
//        return "servicioModel{" + "idServicio=" + idServicio + ", tip_servicio=" + tip_servicio + ", empleadoServ=" + empleadoServ + '}';
//    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idServicio;
    private String tip_servicio;
    @OneToMany(mappedBy = "servicio")
    private List<empleadoServicio> empleadoservicio;
    @OneToMany(mappedBy = "servicio")
    private List<subservicioModel> subservicio;

    public Long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }

    public String getTip_servicio() {
        return tip_servicio;
    }

    public void setTip_servicio(String tip_servicio) {
        this.tip_servicio = tip_servicio;
    }

}
