package com.Shasank.SplitSmart.Service;

import com.Shasank.SplitSmart.entity.User;
import com.Shasank.SplitSmart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(int id, User updatedUser){

        User user = userRepository.findById(id).orElse(null);

        if(user != null){
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());

            return userRepository.save(user);
        }

        return null;
    }

    public String deleteUser(int id){
        userRepository.deleteById(id);
        return "User Deleted Successfully";
    }
}