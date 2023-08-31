package com.example.demo.services;

import com.example.demo.repository.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {


    public List<User> getUsers();

    public User CreateUser(User newUser);


    public User UpdateUser(User updateUser,String id);


    public void DeleteUser(String id);


}
