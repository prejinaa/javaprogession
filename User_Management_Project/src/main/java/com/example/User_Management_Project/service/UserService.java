package com.example.User_Management_Project.service;

import com.example.User_Management_Project.model.User;

public interface UserService {
    public User createUser(User user);
    public boolean checkUserExistsByEmail(String email);//here we create user
}
