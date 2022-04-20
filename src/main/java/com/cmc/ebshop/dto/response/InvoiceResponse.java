package com.cmc.ebshop.dto.response;

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

@Data
class BookOrder {
    private String nameBook;
    private String nameAuthor;
    private String namePublisher;
    private String price;
    private String quantityPurchased;
}
