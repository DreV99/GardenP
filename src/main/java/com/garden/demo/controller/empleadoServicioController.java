/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.controller;

import com.garden.demo.model.empleadoServicio;
import com.garden.demo.repository.RepositoryServicioEmpleado;
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
@RequestMapping("empleadoservicio")
public class empleadoServicioController {
     @Autowired
     RepositoryServicioEmpleado repo;
     @GetMapping("")
    @CrossOrigin
    public List<empleadoServicio> listar() {
        return this.repo.findAll();

    }

    @PostMapping("")
    @CrossOrigin
    public empleadoServicio guardar(@RequestBody empleadoServicio e) {
        return this.repo.save(e);
    }

    @GetMapping("/{idEmpleadoServicio}")
    @CrossOrigin
    public empleadoServicio recuperar(@PathVariable Long idEmpleadoServicio) {
        return this.repo.findById(idEmpleadoServicio).get();
    }

    @DeleteMapping("/{idEmpleadoServicio}")
    @CrossOrigin
    public void eliminar(@PathVariable Long idEmpleadoServicio) {
        this.repo.deleteById(idEmpleadoServicio);
    }
    
}
