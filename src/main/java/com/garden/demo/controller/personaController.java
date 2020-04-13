/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.controller;

import com.garden.demo.model.clienteModel;
import com.garden.demo.model.personaModel;
import com.garden.demo.repository.repositoryCliente;
import com.garden.demo.repository.repositoryPersonaextends;
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
@RequestMapping("persona")
public class personaController {

    @Autowired
    repositoryPersonaextends repo;

    @GetMapping("")
    @CrossOrigin

    public List<personaModel> listar() {
        return this.repo.findAll();

    }

    @PostMapping("")
    @CrossOrigin
    public personaModel listar(@RequestBody personaModel e) {
        return this.repo.save(e);
    }
}
