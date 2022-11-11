/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GremioCaninoSQL.GremioCaninoSQL.repository;




import com.GremioCaninoSQL.GremioCaninoSQL.model.User;
import com.GremioCaninoSQL.GremioCaninoSQL.repository.crud.UserRepositoryCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired
    private UserRepositoryCrud userRepositoryCrud;

    public List<User> getAll() {
        return (List<User>) userRepositoryCrud.findAll();
    }

    public Optional<User> getUser(Integer id) {
        return userRepositoryCrud.findById(id);
    }

    public User save(User s){
        return (User) userRepositoryCrud.save(s);
    }
    

    public boolean existeEmail(String email) {
        Optional<User> usuario = userRepositoryCrud.findByEmail(email);
        return !usuario.isEmpty();
    }

    public Optional<User> autenticarUsuario(String email, String password) {
        return userRepositoryCrud.findByEmailAndPassword(email, password);
    }
}