/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.controller;

import com.garden.demo.model.servicioModel;
import com.garden.demo.repository.RepositoryServicio;
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
@RequestMapping("servicio")
public class servicioController {

    @Autowired
    RepositoryServicio repo;

    @GetMapping("")
    @CrossOrigin
    public List<servicioModel> listar() {
        return this.repo.findAll();

    }

    @PostMapping("")
    @CrossOrigin
    public servicioModel guardar(@RequestBody servicioModel e) {
        return this.repo.save(e);
    }

    @GetMapping("/{idServicio}")
    @CrossOrigin
    public servicioModel recuperar(@PathVariable Long idServicio) {
        return this.repo.findById(idServicio).get();
    }

    @DeleteMapping("/{idServicio}")
    @CrossOrigin
    public void eliminar(@PathVariable Long idServicio) {
        this.repo.deleteById(idServicio);
    }

}
