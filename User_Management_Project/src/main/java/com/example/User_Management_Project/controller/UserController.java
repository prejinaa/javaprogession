package com.example.User_Management_Project.controller;

import com.example.User_Management_Project.model.User;
import com.example.User_Management_Project.repository.UserRepository;
import com.example.User_Management_Project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller


public class UserController {
    @Autowired
    private UserService userService;

    public String getBase() {
        return "base";
    }


    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/register")
    public String getRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String createUser(@ModelAttribute User user) {
        boolean f = userService.checkUserExistsByEmail(user.getEmail());
        if (f) {
            System.out.println("email is already exist");
        } else {
            User user1 = userService.createUser(user);
            if (user1 != null) {
                System.out.println("successfully register");
            } else {
                System.out.println("register to fail");
            }
        }
        return "redirect:/register";
    }
}



