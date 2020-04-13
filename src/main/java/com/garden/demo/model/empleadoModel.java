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
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AlexanderGuzman
 */
@Entity
@Table(name = "empleado")
public class empleadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmpleado;
    private String emp_user;
    private String emp_pass;
    @OneToOne
    @JoinColumn(name = "idPersona")
    private personaModel persona;
    @OneToMany(mappedBy = "empleado")
    private List<empleadoServicio> empleadoservicio;


    @OneToMany(mappedBy = "empleado")
    private List<comentarioModel> comentario;

    @OneToMany(mappedBy = "empleado")
    private List<tareasModel> tareas;
    
    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getEmp_user() {
        return emp_user;
    }

    public void setEmp_user(String emp_user) {
        this.emp_user = emp_user;
    }

    public String getEmp_pass() {
        return emp_pass;
    }

    public void setEmp_pass(String emp_pass) {
        this.emp_pass = emp_pass;
    }

    public personaModel getPersona() {
        return persona;
    }

    public void setPersona(personaModel persona) {
        this.persona = persona;
    }

}
