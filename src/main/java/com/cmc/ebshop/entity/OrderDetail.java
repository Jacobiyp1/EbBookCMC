package com.cmc.ebshop.entity;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class OrderDetail {
    private String id;
    private String orderId;
    private  String bookId;
    private Long quantity;
    private BigDecimal price;
}
