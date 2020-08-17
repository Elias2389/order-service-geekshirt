package com.geekshirt.orderservice.controller;

import com.geekshirt.orderservice.dto.OrderResponse;
import com.geekshirt.orderservice.entity.Order;
import com.geekshirt.orderservice.dto.OrderRequest;
import com.geekshirt.orderservice.service.OrderService;
import com.geekshirt.orderservice.util.EntityDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    OrderService service;

    @Autowired
    private EntityDtoConverter converter;

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

        orderList.add(order);

        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    @GetMapping(value = "order/{orderId}")
    public ResponseEntity<OrderResponse> findById(@PathVariable("orderId") String orderId ) {
        return new ResponseEntity<>(service.findById(orderId), HttpStatus.OK);
    }

    @PostMapping(value = "order/create")
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest payload) {
        Order order = service.createOrder(payload);
        return new ResponseEntity<>(converter.convertEntityToDto(order), HttpStatus.CREATED);
    }
}
