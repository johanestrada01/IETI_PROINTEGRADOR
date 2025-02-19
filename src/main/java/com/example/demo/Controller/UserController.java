package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @ResponseBody
    public User getUser(@PathVariable("id") String id){
        return userService.getUser(id);
    }

    @GetMapping
    @ResponseBody
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") String id){
        userService.deleteUser(id);
    }

}
