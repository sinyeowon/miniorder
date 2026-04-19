package com.sparta.assignment.prduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sparta.assignment.prduct.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
