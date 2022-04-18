package com.cmc.ebshop.dto.request;

import java.math.BigDecimal;

public class BookSearchRequest {
    private String id;
    private String name;
    private String authorId;
    private String publisherId;
    private BigDecimal priceFrom;
    private BigDecimal priceTo;
}
