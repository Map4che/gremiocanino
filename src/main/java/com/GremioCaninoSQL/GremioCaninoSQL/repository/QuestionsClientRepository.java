/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GremioCaninoSQL.GremioCaninoSQL.repository;


import com.GremioCaninoSQL.GremioCaninoSQL.model.QuestionsClient;
import com.GremioCaninoSQL.GremioCaninoSQL.repository.crud.QuestionsClientRepositoryCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionsClientRepository {
    
    @Autowired
    private QuestionsClientRepositoryCrud questionsClientRepositoryCrud;
    
    public List<QuestionsClient>getAll(){
        return (List<QuestionsClient>)questionsClientRepositoryCrud.findAll();
    }
    
    public Optional<QuestionsClient>getQuestions(int id){
        return questionsClientRepositoryCrud.findById(id);
    }
    
    public QuestionsClient save(QuestionsClient q){
        return questionsClientRepositoryCrud.save(q);
    }
    
    public void delete(QuestionsClient q){
        questionsClientRepositoryCrud.delete(q);
    }
    
}
