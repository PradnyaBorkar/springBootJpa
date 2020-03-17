package com.spring.bank.rest;

import com.spring.bank.domain.User;
import com.spring.bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserHandler {

    @Autowired
    UserRepository userRepository;


    @RequestMapping(value = "" , method = RequestMethod.GET)
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable long userId){
        return userRepository.findById(userId);
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}
