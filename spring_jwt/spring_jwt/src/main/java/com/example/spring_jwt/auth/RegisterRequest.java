package com.example.spring_jwt.auth;

import com.example.spring_jwt.user.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;

}
