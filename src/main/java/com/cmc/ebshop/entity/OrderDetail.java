package com.cmc.ebshop.entity;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class OrderDetail {
    private String id;
    private Orders order;
    private  Book book;
    private Long quantity;
    private BigDecimal price;
}
