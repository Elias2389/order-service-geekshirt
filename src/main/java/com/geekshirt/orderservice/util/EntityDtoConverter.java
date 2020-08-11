package com.geekshirt.orderservice.util;

import com.geekshirt.orderservice.dto.OrderResponse;
import com.geekshirt.orderservice.entity.Order;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EntityDtoConverter {

    private final ModelMapper modelMapper;

    @Autowired
    public EntityDtoConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public OrderResponse convertEntityToDto(Order order) {
        return modelMapper.map(order, OrderResponse.class);
    }

    public List<OrderResponse> convertEntityToDto(List<Order> orders) {
        return orders.stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }
}
