/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.controller;

import com.garden.demo.model.jardinesModelosModel;
import com.garden.demo.repository.RepositoryJardinesModelos;
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
@RequestMapping("jardinesmodelos")
public class jardinesmodelosController {
     @Autowired
     RepositoryJardinesModelos repo;
     @GetMapping("")
    @CrossOrigin
    public List<jardinesModelosModel> listar() {
        return this.repo.findAll();

    }

    @PostMapping("")
    @CrossOrigin
    public jardinesModelosModel guardar(@RequestBody jardinesModelosModel e) {
        return this.repo.save(e);
    }

    @GetMapping("/{idJardinesModelos}")
    @CrossOrigin
    public jardinesModelosModel recuperar(@PathVariable Long idJardinesModelos) {
        return this.repo.findById(idJardinesModelos).get();
    }

    @DeleteMapping("/{idJardinesModelos}")
    @CrossOrigin
    public void eliminar(@PathVariable Long idJardinesModelos) {
        this.repo.deleteById(idJardinesModelos);
    }
    
}
