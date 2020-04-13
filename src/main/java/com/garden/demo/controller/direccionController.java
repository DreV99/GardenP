/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.controller;

import com.garden.demo.model.direccionModel;
import com.garden.demo.repository.RepositoryDireccion;
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
@RequestMapping("direccion")
public class direccionController {

    @Autowired
    RepositoryDireccion repo;

    @GetMapping("")
    @CrossOrigin
    public List<direccionModel> listar() {
        return this.repo.findAll();

    }

    @PostMapping("")
    @CrossOrigin
    public direccionModel guardar(@RequestBody direccionModel e) {
        return this.repo.save(e);
    }

    @GetMapping("/{idDireccion}")
    @CrossOrigin
    public direccionModel recuperar(@PathVariable Long idDireccion) {
        return this.repo.findById(idDireccion).get();
    }

    @DeleteMapping("/{idDireccion}")
    @CrossOrigin
    public void eliminar(@PathVariable Long idDireccion) {
        this.repo.deleteById(idDireccion);
    }
}
