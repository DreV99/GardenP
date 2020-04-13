/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.controller;

import com.garden.demo.model.subservicioModel;
import com.garden.demo.model.tareasModel;
import com.garden.demo.repository.RepositoryTareas;
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
@RequestMapping("tareas")
public class tareasController {
     @Autowired
    RepositoryTareas repo;
     @GetMapping("")
    @CrossOrigin
    public List<tareasModel> listar() {
        return this.repo.findAll();

    }

    @PostMapping("")
    @CrossOrigin
    public tareasModel guardar(@RequestBody tareasModel e) {
        return this.repo.save(e);
    }

    @GetMapping("/{idRTareas}")
    @CrossOrigin
    public tareasModel recuperar(@PathVariable Long idRTareas) {
        return this.repo.findById(idRTareas).get();
    }

    @DeleteMapping("/{idRTareas}")
    @CrossOrigin
    public void eliminar(@PathVariable Long idRTareas) {
        this.repo.deleteById(idRTareas);
    }
}
