/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GremioCanino.GremioCanino.service;


import com.GremioCanino.GremioCanino.model.User;
import com.GremioCanino.GremioCanino.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
   @Autowired
   private UserRepository userRepository;
   
   public List<User> getAll(){
       return userRepository.getAll();
   }
   
   public Optional<User> getUser(int id){
       return userRepository.getUser(id);
   }
   
   public User registrar(User user){
      if(user.getId()==null){
           if(existeEmail(user.getEmail())==false){
               return userRepository.save(user);
           }else{
               return user;
           }
       }else{
           return user;
       }
   }
   
   public boolean existeEmail (String email){
       return userRepository.existeEmail(email);
   }
   
   public User autenticarUser(String email, String password){
       Optional<User> u = userRepository.autenticarUsuario(email, password);
       
       if(!u.isEmpty()){
           return new User (email,password, "No Existe");
       }else{
           return u.get();
       }
   }
   
   public User update(User user){
       if(user.getId()!=null){
           Optional<User> u=userRepository.getUser(user.getId());
           if(!u.isEmpty()){
               if(user.getName()!=null){
                   u.get().setName(user.getName());
               }
               if(user.getAddress()!=null){
                   u.get().setAddress(user.getAddress());
               }
               if(user.getEmail()!=null){
                   u.get().setEmail(user.getEmail());
               }
               if(user.getPassword()!=null){
                   u.get().setPassword(user.getPassword());
               }
               if(user.getPhone()!=null){
                   u.get().setPhone(user.getPhone());
               }
               if(user.getBussiness()!=null){
                   u.get().setBussiness(user.getBussiness());
               }
               return userRepository.save(u.get());
           }
       }return user;
   }
   
   
}
