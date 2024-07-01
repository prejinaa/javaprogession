package com.example.User_Management_Project.repository;

import com.example.User_Management_Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByEmail(String email);;
}
