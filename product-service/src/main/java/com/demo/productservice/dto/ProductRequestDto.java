package com.demo.productservice.dto;

import com.demo.productservice.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ProductRequestDto {

    private String title;
    private String description;
    private String category;
    private Integer price;
    private Integer stock;
    private String imageUrl;
    private LocalDateTime openTime;

    public Product toProduct() {
        return new Product(title, description, category, price, stock, imageUrl, openTime);
    }
}