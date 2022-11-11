/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GremioCaninoSQL.GremioCaninoSQL.controller;


import com.GremioCaninoSQL.GremioCaninoSQL.model.Persona;
import com.GremioCaninoSQL.GremioCaninoSQL.service.PersonaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/all")
    public List<Persona>getAll(){
    return personaService.getAll();
}
    
    @GetMapping("/{pj}")
    public Optional<Persona>getPersona(String pj){
        return personaService.getPj(pj);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona save(@RequestBody Persona p){
        return personaService.save(p);      
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona update(@RequestBody Persona p){
        return personaService.update(p);
    }
    
    @DeleteMapping("/{pj}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete (@PathVariable ("id") String pj){
        return personaService.delete(pj);
    }
}