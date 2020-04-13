/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.controller;

import com.garden.demo.model.peticionesModel;
import com.garden.demo.repository.RepositoryPeticiones;

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
@RequestMapping("peticiones")
public class peticionesController {

    @Autowired
    RepositoryPeticiones repo;

    @GetMapping("")
    @CrossOrigin
    public List<peticionesModel> listar() {
        return this.repo.findAll();

    }

    @PostMapping("")
    @CrossOrigin
    public peticionesModel guardar(@RequestBody peticionesModel e) {
        return this.repo.save(e);
    }

    @GetMapping("/{idPeticiones}")
    @CrossOrigin
    public peticionesModel recuperar(@PathVariable Long idPeticiones) {
        return this.repo.findById(idPeticiones).get();
    }

    @DeleteMapping("/{idPeticiones}")
    @CrossOrigin
    public void eliminar(@PathVariable Long idPeticiones) {
        this.repo.deleteById(idPeticiones);
    }
}
