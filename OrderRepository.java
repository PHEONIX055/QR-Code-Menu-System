package com.example.qrmenu.repositories;

import com.example.qrmenu.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
