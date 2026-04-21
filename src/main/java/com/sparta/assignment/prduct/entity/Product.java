package com.sparta.assignment.prduct.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "products")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private Integer price;

    // Product를 생성할 때, name과 price가 있어야 생성할 수 있도록 비즈니스 생성자 정의
    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    // update 메서드는 자동으로 주어지지 않기 때문에 직접 정의해서 사용
    public void update(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

}
