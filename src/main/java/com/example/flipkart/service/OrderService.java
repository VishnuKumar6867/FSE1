package com.example.flipkart.service;

import com.example.flipkart.entity.Order;
import com.example.flipkart.model.CustomerModel;
import com.example.flipkart.model.OrderModel;
import com.example.flipkart.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;



    @Autowired
    private RestTemplate rest;

    String url = "lb://PRODUCT/product/item-price/{quantity}/{itemNumber}";
    Map<String,Object> urlVariables = new HashMap<>();
    public Order saveOrder(OrderModel model, long itemId) {
        Order order = new Order();
        int trnId=0;
        String trnNumber = "TRN000"+ ++trnId;
        order.setTrnNumber(trnNumber);
        order.setItemId(itemId);
        order.setEmail(model.getEmail());
        //booking.setMealType(model.getMealType());
        order.setName(model.getName());
       // order.setQuantity(model.getQuantity).size());
        StringBuilder customers = new StringBuilder();
        for(CustomerModel p:model.getCustomer()) {
            customers.append(p.getCustomerName())
                    .append(",")
                    .append(p.getCustomerAge())
                    .append(",")
                    .append(p.getCustmerGender())
                    .append(";");
        }

        order.setCustomers(customers.substring(0, customers.length()-1));
      //  urlVariables.put("quantity", model.getQuantity());
        urlVariables.put("itemNumber", itemId);
        ResponseEntity<Double> price = rest.getForEntity(url, double.class,urlVariables);
        order.setPrice(price.getBody() * model.getCustomer().size());
        Order ordered = orderRepository.save(order);
        return ordered;
    }
}
