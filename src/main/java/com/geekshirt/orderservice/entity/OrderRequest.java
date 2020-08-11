package com.geekshirt.orderservice.entity;

import java.util.List;

public class OrderRequest {
    private String accountId;
    private List<LineItem> items;
}
