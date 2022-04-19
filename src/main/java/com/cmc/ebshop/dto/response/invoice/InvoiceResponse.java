package com.cmc.ebshop.dto.response.invoice;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class InvoiceResponse {
    private String nameCustomer;
    private String emailCustomer;
    private String phoneCustomer;
    private BigDecimal totalPrice;
    private List<BookOrder> bookOrders;
}


