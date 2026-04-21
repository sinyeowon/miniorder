package com.sparta.assignment.order.dto;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OrderRequest {

    @NotNull(message = "상품 ID는 필수입니다.")
    private Long productId;

}
