/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garden.demo.repository;


import com.garden.demo.model.tareasModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AlexanderGuzman
 */
public interface RepositoryTareas extends JpaRepository<tareasModel, Long>{
    
}
