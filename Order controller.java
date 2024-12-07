package com.example.qrmenu.controllers;

import com.example.qrmenu.entities.Order;
import com.example.qrmenu.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/place")
    public String placeOrder(@RequestBody Order order) {
        orderRepository.save(order);
        return "Order placed successfully!";
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
