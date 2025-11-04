package com.example.productsShopping.dto;

import lombok.Data;

@Data
public class CartItemDto {
    private Long id;
    private Long product;
    private Long brand;
    private Long model;
    private String category;
    private String description;
    private double price;
    private double rate;
    private String imageUrl;
    private Integer quantity;
}
