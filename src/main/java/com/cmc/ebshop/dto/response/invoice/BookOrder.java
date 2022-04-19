package com.cmc.ebshop.dto.response.invoice;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BookOrder {
    private String nameBook;
    private String nameAuthor;
    private String namePublisher;
    private BigDecimal price;
    private Integer quantityPurchased;
}
