package com.cmc.ebshop.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Book {
    private String id;
    private String name;
    private Author author;
    private Publisher publisher;
    private BigDecimal price;
    private Date publishedYear;
    private String status;
    private Long quantityCurrent;
    private Long quantitySold;
}
