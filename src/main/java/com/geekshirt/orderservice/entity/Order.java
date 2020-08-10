package com.geekshirt.orderservice.entity;

import java.util.Date;

public class Order {
    private String orderId;
    private String status;
    private String accountId;
    private Double totalAmount;
    private Double totalTax;
    private Date transactionDate;
}
