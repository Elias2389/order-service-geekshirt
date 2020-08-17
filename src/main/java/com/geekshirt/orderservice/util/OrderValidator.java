package com.geekshirt.orderservice.util;

import com.geekshirt.orderservice.dto.OrderRequest;
import com.geekshirt.orderservice.exception.IncorrectRequestOrderException;

public class OrderValidator {
    public static boolean validateOrder(OrderRequest order) {
        if (order.getItems().isEmpty() || order.getItems() == null) {
            throw new IncorrectRequestOrderException("ocurrio un error");
        }

        return true;
    }
}
