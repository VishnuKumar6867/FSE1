package com.example.flipkart.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class UserRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long regId;

    private String firstName;
    private String lastName;
    private String email;
    private String logInId;
    private String password;
    private String confirmPassword;
    private long contactNumber;

}
