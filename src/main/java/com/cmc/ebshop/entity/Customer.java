package com.cmc.ebshop.entity;

import lombok.Data;

@Data
public class Customer {
    private String id ;
    private String email;
    private String phone;
    private String name;
    private  String address;
}
