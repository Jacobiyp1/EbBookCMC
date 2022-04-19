package com.cmc.ebshop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Orders {
    private String id;
    private String customerId;
    private String status;
}
