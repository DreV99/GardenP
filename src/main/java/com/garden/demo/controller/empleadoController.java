/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.controller;

import com.garden.demo.model.empleadoModel;
import com.garden.demo.repository.RepositoryEmpleado;

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
@RequestMapping("empleado")
public class empleadoController {
    @Autowired
    RepositoryEmpleado repo;

    @GetMapping("")
    @CrossOrigin
    public List<empleadoModel> listar() {
        return this.repo.findAll();

    }

    @PostMapping("")
    @CrossOrigin
    public empleadoModel guardar(@RequestBody empleadoModel e) {
        return this.repo.save(e);
    }

    @GetMapping("/{idEmpleado}")
    @CrossOrigin
    public empleadoModel recuperar(@PathVariable Long idEmpleado) {
        return this.repo.findById(idEmpleado).get();
    }

    @DeleteMapping("/{idEmpleado}")
    @CrossOrigin
    public void eliminar(@PathVariable Long idEmpleado) {
        this.repo.deleteById(idEmpleado);
    }
}
