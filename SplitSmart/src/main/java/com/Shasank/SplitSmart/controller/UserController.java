package com.Shasank.SplitSmart.controller;

import com.Shasank.SplitSmart.Service.UserService;
import com.Shasank.SplitSmart.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // Create User
    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    // Get All Users
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    // Get User By Id
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    // Update User
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable int id,
                           @RequestBody User updatedUser){
        return userService.updateUser(id, updatedUser);
    }

    // Delete User
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }
}