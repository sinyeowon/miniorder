package com.sparta.assignment.prduct.dto;

import lombok.Getter;

import com.sparta.assignment.prduct.entity.Product;

@Getter
public class ProductResponse {

    private final Long id;
    private final String name;
    private final Integer price;

    public ProductResponse(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
    }

}
