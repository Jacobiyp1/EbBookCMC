package com.cmc.ebshop.entity;

import lombok.Data;

@Data
public class Orders {
    private String id;
    private Customer customer;
    private String status ;
}
