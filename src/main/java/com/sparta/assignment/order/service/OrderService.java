package com.sparta.assignment.order.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

import com.sparta.assignment.order.dto.OrderRequest;
import com.sparta.assignment.order.dto.OrderResponse;
import com.sparta.assignment.order.entity.Order;
import com.sparta.assignment.order.repository.OrderRepository;
import com.sparta.assignment.prduct.entity.Product;
import com.sparta.assignment.prduct.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    @Transactional
    public OrderResponse createOrder(OrderRequest request) {
        Product product = productRepository.findById(request.getProductId())
                .orElseThrow(() -> new IllegalArgumentException(
                        "해당 상품이 존재하지 않습니다. id=" + request.getProductId()
                ));

        Order order = new Order(product);
        Order saved = orderRepository.save(order);
        OrderResponse orderResponse = new OrderResponse(saved);
        return orderResponse;
    }

    @Transactional(readOnly = true)
    public OrderResponse getOrder(Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                        "해당 주문이 존재하지 않습니다. id=" + id
                ));
        OrderResponse orderResponse = new OrderResponse(order);
        return orderResponse;
    }

}
