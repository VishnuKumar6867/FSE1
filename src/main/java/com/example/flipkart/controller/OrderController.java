package com.example.flipkart.controller;


import com.example.flipkart.entity.Order;
import com.example.flipkart.entity.UserRegister;
import com.example.flipkart.model.OrderModel;
import com.example.flipkart.service.OrderService;
import com.example.flipkart.service.UserRegisterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1.0/shopping")
public class OrderController {
    @Autowired
    UserRegisterServices registerServices;
    @Autowired
    OrderService orderService;
    @PostMapping("/register")
    public UserRegister register(@RequestBody UserRegister register, String password, String confirmPassword){
        return  registerServices.userRegister(register,password,confirmPassword);
    }
    @PostMapping("/{flightId}")
    public ResponseEntity<Order> save(@RequestBody OrderModel orderModel, @PathVariable long itemId) {
        Order order = orderService.saveOrder(orderModel,itemId);
        return new ResponseEntity<>(order,order != null? HttpStatus.OK:HttpStatus.NO_CONTENT);
    }

}
