package com.example.demo.Service;

import com.example.demo.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserService {

    HashMap<String, User> users = new HashMap<>();

    public void createUser(User user){
        users.put(user.getId(), user);
    }

    public User getUser(String id){
        return users.get(id);
    }

    public List<User> getAllUsers(){
        return new ArrayList<>(users.values());
    }

    public void updateUser(User user){
        users.remove(user.getId());
        users.put(user.getId(), user);
    }

     public void deleteUser(String id){
        users.remove(id);
     }

}
