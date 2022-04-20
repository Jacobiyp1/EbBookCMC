package com.cmc.ebshop.service.impl;

import com.cmc.ebshop.dto.response.invoice.InvoiceResponse;
import com.cmc.ebshop.mapper.IInvoiceMapper;
import com.cmc.ebshop.service.IInvoiceService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class InvoiceServiceImpl implements IInvoiceService {

    @Autowired
    private IInvoiceMapper iInvoiceMapper;

    @Override
    public InvoiceResponse getInvoice(String orderId) {
        if (Strings.isBlank(orderId)) {
            return null;
        }
        InvoiceResponse responses = iInvoiceMapper.getInvoice(orderId);
        responses.setTotalPrice(responses.getBookOrders().stream().map(item -> item.getPrice().multiply(BigDecimal.valueOf(item.getQuantityPurchased()))).reduce(BigDecimal.ZERO, BigDecimal::add));
        return responses;
    }
}