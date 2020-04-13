/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.model;

import java.util.Date;
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
@Table(name = "peticiones")
public class peticionesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPeticiones;
    private Date fecha_peti;
    private String estado_peti;
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private clienteModel cliente;

    @OneToMany(mappedBy = "peticiones")
    private List<peticionServicioModel> peticionservicio;
//    
    @ManyToOne
    @JoinColumn(name = "idRTareas")
    private tareasModel tareas;

    public Long getIdPeticiones() {
        return idPeticiones;
    }

    public void setIdPeticiones(Long idPeticiones) {
        this.idPeticiones = idPeticiones;
    }

    public Date getFecha_peti() {
        return fecha_peti;
    }

    public void setFecha_peti(Date fecha_peti) {
        this.fecha_peti = fecha_peti;
    }

    public String getEstado_peti() {
        return estado_peti;
    }

    public void setEstado_peti(String estado_peti) {
        this.estado_peti = estado_peti;
    }

    public clienteModel getCliente() {
        return cliente;
    }

    public void setCliente(clienteModel cliente) {
        this.cliente = cliente;
    }



    public tareasModel getTareas() {
        return tareas;
    }

    public void setTareas(tareasModel tareas) {
        this.tareas = tareas;
    }


}
