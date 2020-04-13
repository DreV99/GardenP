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
@Table(name = "comentario")
public class comentarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idComentario;
    private String text_coment;
    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    private empleadoModel empleado;
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private clienteModel cliente;

    public Long getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Long idComentario) {
        this.idComentario = idComentario;
    }

    public String getText_coment() {
        return text_coment;
    }

    public void setText_coment(String text_coment) {
        this.text_coment = text_coment;
    }

//    public clienteModel getClientemodel() {
//        return clientemodel;
//    }
//
//    public void setClientemodel(clienteModel clientemodel) {
//        this.clientemodel = clientemodel;
//    }
    public empleadoModel getEmpleado() {
        return empleado;
    }

    public void setEmpleado(empleadoModel empleado) {
        this.empleado = empleado;
    }

    public clienteModel getCliente() {
        return cliente;
    }

    public void setCliente(clienteModel cliente) {
        this.cliente = cliente;
    }
    

}
