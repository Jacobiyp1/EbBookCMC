package com.cmc.ebshop.dto.response.statistics;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TopFiveCustomerBuyBooks {
    private String nameCustomer;
    private String email;
    private String phone;
    private String address;
    private Integer totalQuantity;
    private BigDecimal totalPrice;
}
