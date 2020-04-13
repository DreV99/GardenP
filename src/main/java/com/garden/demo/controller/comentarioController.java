/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.controller;

import com.garden.demo.model.comentarioModel;
import com.garden.demo.repository.RepositoryComentario;
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
@RequestMapping("comentario")
public class comentarioController {
     @Autowired
     RepositoryComentario repo;

    @GetMapping("")
    @CrossOrigin
    public List<comentarioModel> listar() {
        return this.repo.findAll();

    }

    @PostMapping("")
    @CrossOrigin
    public comentarioModel guardar(@RequestBody comentarioModel e) {
        return this.repo.save(e);
    }

    @GetMapping("/{idComentario}")
    @CrossOrigin
    public comentarioModel recuperar(@PathVariable Long idComentario) {
        return this.repo.findById(idComentario).get();
    }

    @DeleteMapping("/{idComentario}")
    @CrossOrigin
    public void eliminar(@PathVariable Long idComentario) {
        this.repo.deleteById(idComentario);
    }
}
