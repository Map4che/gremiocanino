/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GremioCaninoSQL.GremioCaninoSQL.repository;


import com.GremioCaninoSQL.GremioCaninoSQL.model.Persona;
import com.GremioCaninoSQL.GremioCaninoSQL.repository.crud.PersonaRepositoryCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepository {
    
    @Autowired
    private PersonaRepositoryCrud personaRepositoryCrud;
    
    public List<Persona>getAll(){
        return (List<Persona>)personaRepositoryCrud.findAll();
    }
    
    public Optional<Persona>getPersona(String pj){
        return personaRepositoryCrud.findByPj(pj);
    
}
    public Persona save(Persona p){
        return personaRepositoryCrud.save(p);
    }
    
    public void delete(Persona p){
        personaRepositoryCrud.delete(p);
    }
    
}
