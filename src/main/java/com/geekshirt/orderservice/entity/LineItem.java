package com.geekshirt.orderservice.entity;

import lombok.Data;

@Data
public class LineItem {
    private String upc;
    private int quantity;
    private double price;
}
