package com.garden.demo.repository;

import com.garden.demo.model.empleadoModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AlexanderGuzman
 */
public interface RepositoryEmpleado extends JpaRepository<empleadoModel, Long> {

    
}
