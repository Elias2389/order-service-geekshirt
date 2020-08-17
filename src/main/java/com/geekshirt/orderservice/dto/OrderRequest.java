package com.geekshirt.orderservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.geekshirt.orderservice.entity.LineItem;
import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {
    @JsonProperty("account_id")
    private String accountId;
    private List<LineItem> items;
}
