package com.example.demo.controller.user;


import com.example.demo.repository.user.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.getUsers());


    }


    @PostMapping("")
    public ResponseEntity<User> createUser(@RequestBody  User newUser) throws URISyntaxException {
        URI uriResponse = new URI("http://localhost:8080/api/v1/user/" + newUser.getId());
        return ResponseEntity.created(uriResponse).body(userService.CreateUser(newUser));
    }


    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User updateUser, @PathVariable("id") String id){
        return ResponseEntity.ok(userService.UpdateUser(updateUser,id));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") String id){
        userService.DeleteUser(id);
        return ResponseEntity.ok().build();
    }


}
