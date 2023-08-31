package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.user.User;
import com.example.demo.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    Map<String,User> userBD = new HashMap<>();


    @Override
    public List<User> getUsers() {
        return new ArrayList<>(userBD.values());
    }

    @Override
    public User CreateUser(User newUser) {
        userBD.put(newUser.getId(),newUser);
        return  newUser;
    }

    @Override
    public User UpdateUser(User updateUser,String id) {
        if(!(userBD.containsKey(id))){
            throw new UserNotFoundException(id);
        }
        User getUser = userBD.get(id);
        getUser.setName(updateUser.getName());
        getUser.setUserName(updateUser.getUserName());
        getUser.setPassword(updateUser.getPassword());
        return getUser;

    }

    @Override
    public void DeleteUser(String id) {
        if(!(userBD.containsKey(id))){
            throw new UserNotFoundException(id);
        }
        userBD.remove(id);



    }
}
