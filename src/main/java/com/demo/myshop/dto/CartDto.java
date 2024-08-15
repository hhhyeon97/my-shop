package com.demo.myshop.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CartDto {
    private Long id;
    private Long userId;
    private Integer totalPrice;
    private List<CartItemDto> items;
}