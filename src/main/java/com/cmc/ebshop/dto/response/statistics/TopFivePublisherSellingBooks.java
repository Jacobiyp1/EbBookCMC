package com.cmc.ebshop.dto.response.statistics;

import lombok.Data;

@Data
public class TopFivePublisherSellingBooks {
    private String namePublisher;
    private Integer quantitySold;
}
