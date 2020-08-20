package com.geekshirt.orderservice.service;

import com.geekshirt.orderservice.client.CustomerClientService;
import com.geekshirt.orderservice.dto.AccountDto;
import com.geekshirt.orderservice.dto.OrderResponse;
import com.geekshirt.orderservice.entity.Order;
import com.geekshirt.orderservice.dto.OrderRequest;
import com.geekshirt.orderservice.util.OrderValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    @Autowired
    CustomerClientService customerClient;

    public OrderResponse findById(Long orderId ) {
        return null;
    }

    public Order createOrder(OrderRequest orderRequest) {
        OrderValidator.validateOrder(orderRequest);


        AccountDto account = customerClient.findAccount(orderRequest.getAccountId());

        Order response = new Order();
        response.setAccountId(orderRequest.getAccountId());
        response.setOrderId("9999");

        return response;
    }
}
