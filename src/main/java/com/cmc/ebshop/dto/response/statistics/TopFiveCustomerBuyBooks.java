package com.cmc.ebshop.dto.response.statistics;

import lombok.Data;

@Data
public class TopFiveCustomerBuyBooks {
    private String namePublisher;
    private Integer quantitySold;
}
