package com.cmc.ebshop.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BookSearchRequest {
    private String id;
    private String name;
    private String authorId;
    private String publisherId;
    private BigDecimal priceFrom;
    private BigDecimal priceTo;
}
