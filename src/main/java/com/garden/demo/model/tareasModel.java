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
@Table(name = "tareas")
public class tareasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRTareas;
    private Date fecha_tareas;
    @OneToMany(mappedBy = "tareas")
    private List<peticionesModel> peticiones;
    @ManyToOne
    @JoinColumn(name = "idEmpleado")
     private empleadoModel empleado;
     

    public Long getIdRTareas() {
        return idRTareas;
    }

    public void setIdRTareas(Long idRTareas) {
        this.idRTareas = idRTareas;
    }

    public Date getFecha_tareas() {
        return fecha_tareas;
    }

    public void setFecha_tareas(Date fecha_tareas) {
        this.fecha_tareas = fecha_tareas;
    }

    public empleadoModel getEmpleado() {
        return empleado;
    }

    public void setEmpleado(empleadoModel empleado) {
        this.empleado = empleado;
    }


}
