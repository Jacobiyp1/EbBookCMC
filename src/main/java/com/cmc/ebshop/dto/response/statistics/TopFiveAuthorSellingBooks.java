package com.cmc.ebshop.dto.response.statistics;

import lombok.Data;

@Data
public class TopFiveAuthorSellingBooks {
    private String nameAuthor;
    private Integer quantitySold;
}
