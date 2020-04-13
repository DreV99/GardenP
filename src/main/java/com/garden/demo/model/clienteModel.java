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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author AlexanderGuzman
 */
@Entity
@Table(name = "cliente")
public class clienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;
    private String clien_user;
    private String clien_pass;
//union con persona
    @OneToOne
    @JoinColumn(name = "idPersona")
    private personaModel persona;
    //union con clientes
    @OneToMany(mappedBy = "cliente")
    private List<comentarioModel> comentario;
    @OneToMany(mappedBy = "cliente")
    private List<peticionesModel> peticiones;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getClien_user() {
        return clien_user;
    }

    public void setClien_user(String clien_user) {
        this.clien_user = clien_user;
    }

    public String getClien_pass() {
        return clien_pass;
    }

    public void setClien_pass(String clien_pass) {
        this.clien_pass = clien_pass;
    }
///

    public personaModel getPersona() {
        return persona;
    }

    public void setPersona(personaModel persona) {
        this.persona = persona;
    }

}
