/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GremioCaninoSQL.GremioCaninoSQL.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="preguntasCliente")
public class QuestionsClient implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    @Column(name="honesto")
    private String honest;
    @Column(name = "cumplido")
    private String OnTime;
    @Column(name = "educado")
    private String polite;
    @Column(name = "sincero")
    private String sincer;
    @Column(name = "comentario")
    private String coments;
    @Column(name = "mascota",length = 20, nullable = true)
    private String pet;
    @Column(name = "raza",length = 40,nullable = true)
    private String breed;

    public QuestionsClient() {
    }

    public QuestionsClient(Integer id, String honest, String OnTime, String polite, String sincer, String coments, String pet, String breed) {
        this.id = id;
        this.honest = honest;
        this.OnTime = OnTime;
        this.polite = polite;
        this.sincer = sincer;
        this.coments = coments;
        this.pet = pet;
        this.breed = breed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHonest() {
        return honest;
    }

    public void setHonest(String honest) {
        this.honest = honest;
    }

    public String getOnTime() {
        return OnTime;
    }

    public void setOnTime(String OnTime) {
        this.OnTime = OnTime;
    }

    public String getPolite() {
        return polite;
    }

    public void setPolite(String polite) {
        this.polite = polite;
    }

    public String getSincer() {
        return sincer;
    }

    public void setSincer(String sincer) {
        this.sincer = sincer;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    
    
   
    
}
