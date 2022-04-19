package com.cmc.ebshop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class OrderDetail {
    private String id;
    private String orderId;
    private  String bookId;
    private Integer quantity;
    private BigDecimal price;
}
