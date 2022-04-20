package com.cmc.ebshop.service;

import com.cmc.ebshop.dto.response.invoice.InvoiceResponse;

public interface IInvoiceService {
    InvoiceResponse getInvoice(String orderId);
}