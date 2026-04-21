package com.sparta.assignment.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sparta.assignment.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
