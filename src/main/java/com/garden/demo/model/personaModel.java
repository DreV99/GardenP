/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author AlexanderGuzman
 */
@Entity
@Table(name = "persona")
public class personaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    private String per_nombre;
    private String per_apellido;
    private String per_direccion;
    private String per_correo;
    private String per_telefono;
    private String per_celular;


//    @OneToOne
//    @JoinColumn(name="idCliente")
    @OneToOne(mappedBy = "persona")
    private clienteModel cliente;
    @OneToOne(mappedBy = "persona")
    private empleadoModel empleado;
//    @OneToOne(mappedBy = "persona")
    @OneToOne
    @JoinColumn(name = "idDireccion")
    private direccionModel direccion;

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getPer_nombre() {
        return per_nombre;
    }

    public void setPer_nombre(String per_nombre) {
        this.per_nombre = per_nombre;
    }

    public String getPer_apellido() {
        return per_apellido;
    }

    public void setPer_apellido(String per_apellido) {
        this.per_apellido = per_apellido;
    }

    public String getPer_direccion() {
        return per_direccion;
    }

    public void setPer_direccion(String per_direccion) {
        this.per_direccion = per_direccion;
    }

    public String getPer_correo() {
        return per_correo;
    }

    public void setPer_correo(String per_correo) {
        this.per_correo = per_correo;
    }

    public String getPer_telefono() {
        return per_telefono;
    }

    public void setPer_telefono(String per_telefono) {
        this.per_telefono = per_telefono;
    }

    public String getPer_celular() {
        return per_celular;
    }

    public void setPer_celular(String per_celular) {
        this.per_celular = per_celular;
    }

 

//    public clienteModel getCliente() {
//        return cliente;
//    }
//
//    public void setCliente(clienteModel cliente) {
//        this.cliente = cliente;
//    }
//    
//    

    public direccionModel getDireccion() {
        return direccion;
    }

    public void setDireccion(direccionModel direccion) {
        this.direccion = direccion;
    }
}
