package com.cmc.ebshop.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Book {
    private String id;
    private String name;
    private String authorId;
    private String publisherId;
    private BigDecimal price;
    private Date publishedYear;
    private Boolean deleted;
    private BigDecimal quantityCurrent;
    private BigDecimal quantitySold;
}
