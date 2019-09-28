package com.co.latin.ecociudadano.controller;

import com.co.latin.ecociudadano.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping(value = "/user")
    public String getUser(@PathParam("username") String username) {
        
        return "OK";
    }
}
