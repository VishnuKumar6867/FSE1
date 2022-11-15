package com.example.flipkart.model;

import java.util.ArrayList;
import java.util.List;

public class OrderModel {
    private String name;
    private String email;
    List<CustomerModel> customer = new ArrayList<>();
    private String address;

    public OrderModel() {

    }

    public OrderModel(String name, String email, List<CustomerModel> customer, String address) {
        this.name = name;
        this.email = email;
        this.customer = customer;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CustomerModel> getCustomer() {
        return customer;
    }

    public void setCustomer(List<CustomerModel> customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", customer=" + customer +
                ", address='" + address + '\'' +
                '}';
    }
}
