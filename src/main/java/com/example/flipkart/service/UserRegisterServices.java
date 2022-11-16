package com.example.flipkart.service;

import com.example.flipkart.entity.UserRegister;
import com.example.flipkart.repository.UserRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterServices {
    @Autowired
    UserRegisterRepository registerRepository;


    public UserRegister userRegister(UserRegister register, String password, String confirmPassword) {
        if(password!=confirmPassword) {

        }
        return registerRepository.save(register);
    }
}
