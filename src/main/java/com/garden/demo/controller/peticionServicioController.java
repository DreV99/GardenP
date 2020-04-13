/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.controller;

import com.garden.demo.model.peticionServicioModel;
import com.garden.demo.model.subservicioModel;
import com.garden.demo.repository.RepositoryPeticionServicio;
import com.garden.demo.repository.RepositorySubservicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author AlexanderGuzman
 */
@RestController
@RequestMapping("peticionservicio")
public class peticionServicioController {
    @Autowired
    RepositoryPeticionServicio repo;

    @GetMapping("")
    @CrossOrigin
    public List<peticionServicioModel> listar() {
        return this.repo.findAll();
        

    }

    @PostMapping("")
    @CrossOrigin
    public peticionServicioModel guardar(@RequestBody peticionServicioModel e) {
        return this.repo.save(e);
    }

    @GetMapping("/{idPeticionServicio}")
    @CrossOrigin
    public peticionServicioModel recuperar(@PathVariable Long idPeticionServicio) {
        return this.repo.findById(idPeticionServicio).get();
    }

    @DeleteMapping("/{idPeticionServicio}")
    @CrossOrigin
    public void eliminar(@PathVariable Long idPeticionServicio) {
        this.repo.deleteById(idPeticionServicio);
    }
}
