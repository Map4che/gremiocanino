/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GremioCanino.GremioCanino.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario",indexes = @Index(name="indx_email",columnList="email",unique=true))
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    @Column(name = "nombre",length = 50,nullable = false)
    private String name;
    @Column(name="direccion",length = 150,nullable = false)
    private String address;
    @Column(name = "celular",length = 10,nullable = false)
    private Integer phone;
    @NonNull
    @Column(name = "email",length = 100,nullable = false)
    private String email;
    @Column (name = "password",length = 25,nullable = false)
    private String password;
    @Column(name = "negocio",length = 80,nullable = false)
    private String bussiness;


    public User(String email, String password, String no_Existe) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}