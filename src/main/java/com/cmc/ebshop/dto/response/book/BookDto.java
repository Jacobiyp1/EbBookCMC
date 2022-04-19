package com.cmc.ebshop.dto.response.book;

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
    private Boolean deleted;
    private Integer quantityCurrent;
    private Integer quantitySold;
}
