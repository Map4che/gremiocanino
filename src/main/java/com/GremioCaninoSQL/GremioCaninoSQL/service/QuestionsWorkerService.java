/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GremioCaninoSQL.GremioCaninoSQL.service;


import com.GremioCaninoSQL.GremioCaninoSQL.model.QuestionsWorker;
import com.GremioCaninoSQL.GremioCaninoSQL.repository.QuestionsWorkerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionsWorkerService {
    
    @Autowired
    private QuestionsWorkerRepository questionsWorkerRepository;
    
    public List<QuestionsWorker>getAll(){
        return questionsWorkerRepository.getAll();
    }
    
    public Optional<QuestionsWorker>getQuestions(int id){
        return questionsWorkerRepository.getQuestions(id);
    }
    
    public QuestionsWorker save(QuestionsWorker q){
        if(q.getId()==null){
            return questionsWorkerRepository.save(q);
        }else{
            Optional<QuestionsWorker>u=questionsWorkerRepository.getQuestions(q.getId());
            if(u.isEmpty()){
                return questionsWorkerRepository.save(q);
            }else{
                return q;
            }
        }
    }
    
    public QuestionsWorker update(QuestionsWorker q){
        if(q.getId()!=null){
            Optional<QuestionsWorker>u=questionsWorkerRepository.getQuestions(q.getId());
            if(!u.isEmpty()){
                if(q.getComents()!=null){
                    u.get().setComents(q.getComents());
                }
                if(q.getDrugs()!=null){
                    u.get().setDrugs(q.getDrugs());
                }
                if(q.getDrunk()!=null){
                    u.get().setDrunk(q.getDrunk());
                }
                if(q.getGoodDrive()!=null){
                    u.get().setGoodDrive(q.getGoodDrive());
                }
                if(q.getHonest()!=null){
                    u.get().setHonest(q.getHonest());
                }
                if(q.getOnTime()!=null){
                    u.get().setOnTime(q.getOnTime());
                }
                if(q.getPolite()!=null){
                    u.get().setPolite(q.getPolite());
                }
                if(q.getSincer()!=null){
                    u.get().setSincer(q.getSincer());                
            }
                return questionsWorkerRepository.save(u.get());
            }
        }
        return q;
    }
    
    public boolean delete(int id){
        Optional<QuestionsWorker>p=getQuestions(id);
        if(!p.isEmpty()){
            questionsWorkerRepository.delete(p.get());
            return true;
        }else{
            return false;
        }
    }
}
