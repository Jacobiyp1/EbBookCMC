package com.cmc.ebshop.service;

import com.cmc.ebshop.dto.response.invoice.InvoiceResponse;

import java.util.List;

public interface IInvoiceService {
    InvoiceResponse getInvoice(String orderId);
}
