/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.controller;

import com.garden.demo.model.clienteModel;
import com.garden.demo.model.subservicioModel;
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
@RequestMapping("subservicio")
public class subservicioController {

    @Autowired
    RepositorySubservicio repo;

    @GetMapping("")
    @CrossOrigin
    public List<subservicioModel> listar() {
        return this.repo.findAll();

    }

    @PostMapping("")
    @CrossOrigin
    public subservicioModel guardar(@RequestBody subservicioModel e) {
        return this.repo.save(e);
    }

    @GetMapping("/{idSubservicio}")
    @CrossOrigin
    public subservicioModel recuperar(@PathVariable Long idSubservicio) {
        return this.repo.findById(idSubservicio).get();
    }

    @DeleteMapping("/{idSubservicio}")
    @CrossOrigin
    public void eliminar(@PathVariable Long idSubservicio) {
        this.repo.deleteById(idSubservicio);
    }
}
