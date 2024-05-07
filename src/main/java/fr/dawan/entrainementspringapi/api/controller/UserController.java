package fr.dawan.entrainementspringapi.api.controller;

import fr.dawan.entrainementspringapi.api.model.User;
import fr.dawan.entrainementspringapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController

public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/user")
    public User getUser(@RequestParam int id) {
        Optional user = userService.getUser(id); //Optionnal = utilisateur ou pas
        if(user.isPresent()) {
            return (User)user.get();
        }
        return null;
    }
}
