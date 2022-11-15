package com.example.flipkart.model;

public class CustomerModel {


    private String customerName;
    private int customerAge;


    private String custmerGender;
    public CustomerModel() {
    }

    public CustomerModel(String customerName, int customerAge, String custmerGender) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.custmerGender = custmerGender;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustmerGender() {
        return custmerGender;
    }

    public void setCustmerGender(String custmerGender) {
        this.custmerGender = custmerGender;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "customerName='" + customerName + '\'' +
                ", customerAge=" + customerAge +
                ", custmerGender='" + custmerGender + '\'' +
                '}';
    }
}
