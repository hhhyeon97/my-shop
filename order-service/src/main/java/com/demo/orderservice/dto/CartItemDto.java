package com.demo.orderservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItemDto {
    private Long id;
    private Long productId;
    private Integer quantity;
}