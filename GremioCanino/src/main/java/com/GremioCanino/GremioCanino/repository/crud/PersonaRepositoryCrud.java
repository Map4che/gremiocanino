/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.GremioCanino.GremioCanino.repository.crud;

import com.GremioCanino.GremioCanino.model.Persona;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author lorel
 */
public interface PersonaRepositoryCrud extends CrudRepository<Persona, Integer>{
    Optional<Persona>findByPj(String pj);
    
}
