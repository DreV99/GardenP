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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author AlexanderGuzman
 */
@Entity
@Table(name = "jardinesmodelos")
public class jardinesModelosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idJardinesModelos;
    private String img_nombre;
    private String img_src;
    @OneToMany(mappedBy = "jardinesmodelos")
    private List<subservicioModel> subservicio;

    public Long getIdJardinesModelos() {
        return idJardinesModelos;
    }

    public void setIdJardinesModelos(Long idJardinesModelos) {
        this.idJardinesModelos = idJardinesModelos;
    }

  
    public String getImg_nombre() {
        return img_nombre;
    }

    public void setImg_nombre(String img_nombre) {
        this.img_nombre = img_nombre;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }
    
    
}
