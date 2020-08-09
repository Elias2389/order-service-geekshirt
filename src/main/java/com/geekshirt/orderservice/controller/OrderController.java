package com.geekshirt.orderservice.controller;

import com.geekshirt.orderservice.dto.OrderResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {

    @GetMapping("order")
    public ResponseEntity<List<OrderResponse>> findAll() {
        List<OrderResponse> orderList = new ArrayList<>();

        OrderResponse order = new OrderResponse();
        order.setAccountId("3223424324");
        order.setOrderId("20");
        order.setStatus("PENDING");
        order.setTotalAmount(20D);
        order.setTotalTax(10D);
        order.setTransactionDate(new Date());

        OrderResponse order2 = new OrderResponse();
        order.setAccountId("3223424324");
        order.setOrderId("21");
        order.setStatus("PENDING");
        order.setTotalAmount(30D);
        order.setTotalTax(10D);
        order.setTransactionDate(new Date());

        orderList.add(order);
        orderList.add(order2);

        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }
}
