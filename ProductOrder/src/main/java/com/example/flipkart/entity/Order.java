package com.example.flipkart.entity;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {

    @Id
    private String trnNumber;
    private long itemId;
    private String name;
    private String email;
    private int quantity;
    private String customers;
    private String addresss;
    private double price;

    public Order() {
    }

    public Order(String trnNumber, long itemId, String name, String email, int quantity, String addresss, double price) {
        this.trnNumber = trnNumber;
        this.itemId = itemId;
        this.name = name;
        this.email = email;
        this.quantity = quantity;
        this.addresss = addresss;
        this.price = price;
    }

    public Order(String customers) {
        this.customers = customers;
    }

    public String getTrnNumber() {
        return trnNumber;
    }

    public void setTrnNumber(String trnNumber) {
        this.trnNumber = trnNumber;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "trnNumber='" + trnNumber + '\'' +
                ", itemId=" + itemId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", quantity=" + quantity +
                ", customers='" + customers + '\'' +
                ", addresss='" + addresss + '\'' +
                ", price=" + price +
                '}';
    }
}
