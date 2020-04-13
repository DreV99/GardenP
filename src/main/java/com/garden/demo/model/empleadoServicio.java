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
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author AlexanderGuzman
 */
@Entity
@Table(name = "empleadoservicio")
public class empleadoServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmpleadoServicio;
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "idServicio")
    private servicioModel servicio;
     @ManyToOne
    @JoinColumn(name = "idEmpleado")
    private empleadoModel empleado;

    public Long getIdEmpleadoServicio() {
        return idEmpleadoServicio;
    }

    public void setIdEmpleadoServicio(Long idEmpleadoServicio) {
        this.idEmpleadoServicio = idEmpleadoServicio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public servicioModel getServicio() {
        return servicio;
    }

    public void setServicio(servicioModel servicio) {
        this.servicio = servicio;
    }

    public empleadoModel getEmpleado() {
        return empleado;
    }

    public void setEmpleado(empleadoModel empleado) {
        this.empleado = empleado;
    }

}
