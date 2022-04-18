package com.cmc.ebshop.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BookDto {
    private String id;
    private String name;
    private String authorId;
    private String publisherId;
    private BigDecimal price;
    private Date publishedYear;
    private String status;
    private BigDecimal quantityCurrent;
    private BigDecimal quantitySold;
}
