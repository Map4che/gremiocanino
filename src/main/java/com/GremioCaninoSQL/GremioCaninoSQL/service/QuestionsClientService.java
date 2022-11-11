/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GremioCaninoSQL.GremioCaninoSQL.service;


import com.GremioCaninoSQL.GremioCaninoSQL.model.QuestionsClient;
import com.GremioCaninoSQL.GremioCaninoSQL.repository.QuestionsClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionsClientService {
    
    @Autowired
    private QuestionsClientRepository questionsClientRepository;
    
    public List<QuestionsClient>getAll(){
        return questionsClientRepository.getAll();
    }
    
    public Optional<QuestionsClient>getQuestions(int id){
        return questionsClientRepository.getQuestions(id);
    }
    
    public QuestionsClient save(QuestionsClient q){
        if(q.getId()==null){
            return questionsClientRepository.save(q);
        }else{
            Optional<QuestionsClient>u=questionsClientRepository.getQuestions(q.getId());
            if(u.isEmpty()){
                return questionsClientRepository.save(q);
            }else{
                return q;
            }
        }
    }
    
    public QuestionsClient update(QuestionsClient q){
        if(q.getId()!=null){
            Optional<QuestionsClient>u=questionsClientRepository.getQuestions(q.getId());
            if(!u.isEmpty()){
                if(q.getBreed()!=null){
                    u.get().setBreed(q.getBreed());
                }
                if(q.getComents()!=null){
                    u.get().setComents(q.getComents());
                }
                if(q.getHonest()!=null){
                    u.get().setHonest(q.getHonest());
                }
                if(q.getOnTime()!=null){
                    u.get().setOnTime(q.getOnTime());
                }
                if(q.getPet()!=null){
                    u.get().setPet(q.getPet());
                }
                if(q.getPolite()!=null){
                    u.get().setPolite(q.getPolite());
                }
                if(q.getSincer()!=null){
                    u.get().setSincer(q.getSincer());
                }
                return questionsClientRepository.save(u.get());
            }
        }
        return q;
    }
    
    public boolean delete(int id){
        Optional<QuestionsClient>p=getQuestions(id);
        if(!p.isEmpty()){
            questionsClientRepository.delete(p.get());
            return true;
        }else{
            return false;
        }
    }
}
