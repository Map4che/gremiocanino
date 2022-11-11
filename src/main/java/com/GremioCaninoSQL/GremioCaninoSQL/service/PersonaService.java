/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GremioCaninoSQL.GremioCaninoSQL.service;


import com.GremioCaninoSQL.GremioCaninoSQL.model.Persona;
import com.GremioCaninoSQL.GremioCaninoSQL.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    public List<Persona>getAll(){
        return personaRepository.getAll();
    }
    
    public Optional<Persona>getPj(String pj){
        return personaRepository.getPersona(pj);
    }
    
    public Persona save(Persona p){
        if(p.getId()==null){
            return personaRepository.save(p);
        }else{
            Optional<Persona>e=personaRepository.getPersona(p.getPj());
            if(e.isEmpty()){
                return personaRepository.save(p);
            }else{
                return p;
            }
        }
    }
    
    public Persona update(Persona p){
        if(p.getId()!=null){
            Optional<Persona>e=personaRepository.getPersona(p.getPj());
            if(!e.isEmpty()){
                if(p.getName()!=null){
                    e.get().setName(p.getName());
                }
                if(p.getAddress()!=null){
                    e.get().setAddress(p.getAddress());
                }
                if(p.getPj()!=null){
                    e.get().setPj(p.getPj());
                }
                if(p.getService()!=null){
                    e.get().setService(p.getService());
                }
                return personaRepository.save(e.get());
            }
        }
        return p;
    }
    
    public boolean delete(String pj){
        Optional<Persona>p=getPj(pj);
        if(!p.isEmpty()){
            personaRepository.delete(p.get());
            return true;
        }else{
            return false;
        }
    }
}
