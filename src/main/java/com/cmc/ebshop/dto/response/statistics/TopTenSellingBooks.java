package com.cmc.ebshop.dto.response.statistics;

import lombok.Data;

@Data
public class TopTenSellingBooks {
    private String nameBook;
    private String nameAuthor;
    private String namePublisher;
    private Integer quantitySold;
}
