/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GremioCaninoSQL.GremioCaninoSQL.repository;



import com.GremioCaninoSQL.GremioCaninoSQL.model.QuestionsWorker;
import com.GremioCaninoSQL.GremioCaninoSQL.repository.crud.QuestionsWorkerRepositoryCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionsWorkerRepository {
    
    @Autowired
    private QuestionsWorkerRepositoryCrud questionsWorkerRepositoryCrud;
    
    public List<QuestionsWorker>getAll(){
        return (List<QuestionsWorker>)questionsWorkerRepositoryCrud.findAll();
    }
    
    public Optional<QuestionsWorker>getQuestions(Integer id){
        return questionsWorkerRepositoryCrud.findById(id);
}
    
    public QuestionsWorker save(QuestionsWorker q){
        return questionsWorkerRepositoryCrud.save(q);
    }
    
    public void delete(QuestionsWorker q){
        questionsWorkerRepositoryCrud.delete(q);        
    }
    
}
