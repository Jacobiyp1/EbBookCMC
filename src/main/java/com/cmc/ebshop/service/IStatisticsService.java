package com.cmc.ebshop.service;

import com.cmc.ebshop.dto.response.invoice.InvoiceResponse;

public interface IStatisticsService {
    InvoiceResponse getInvoice(String orderId);
}
