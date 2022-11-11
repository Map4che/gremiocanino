/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.GremioCaninoSQL.GremioCaninoSQL.repository.crud;


import com.GremioCaninoSQL.GremioCaninoSQL.model.User;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface UserRepositoryCrud extends CrudRepository<User,Integer>{
    Optional<User>findByEmail (String email);
    Optional<User>findByEmailAndPassword (String email, String password);
}
