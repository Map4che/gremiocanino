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
@Table(name="trabajadores")
public class QuestionsWorker implements Serializable{
    
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
    @Column(name = "buenConductor")
    private String goodDrive;
    @Column(name = "sobrio")
    private String drunk;
    @Column(name = "limpioDeDrogas")
    private String drugs;
    @Column(name = "comentario")
    private String coments;

    public QuestionsWorker() {
    }

    public QuestionsWorker(Integer id, String honest, String OnTime, String polite, String sincer, String goodDrive, String drunk, String drugs, String coments) {
        this.id = id;
        this.honest = honest;
        this.OnTime = OnTime;
        this.polite = polite;
        this.sincer = sincer;
        this.goodDrive = goodDrive;
        this.drunk = drunk;
        this.drugs = drugs;
        this.coments = coments;
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

    public String getGoodDrive() {
        return goodDrive;
    }

    public void setGoodDrive(String goodDrive) {
        this.goodDrive = goodDrive;
    }

    public String getDrunk() {
        return drunk;
    }

    public void setDrunk(String drunk) {
        this.drunk = drunk;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }
    
}
