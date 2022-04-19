package com.cmc.ebshop.controller;

import com.cmc.ebshop.dto.ResponseBodyDto;
import com.cmc.ebshop.dto.response.invoice.InvoiceResponse;
import com.cmc.ebshop.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private IInvoiceService invoiceService;

    @GetMapping
    public ResponseEntity<ResponseBodyDto<InvoiceResponse>> getInvoice(@RequestParam(name = "orderId", required = false) String orderId) {
        ResponseBodyDto<InvoiceResponse> responseBodyDto = new ResponseBodyDto("Get invoice Success", HttpStatus.OK.value(), invoiceService.getInvoice(orderId));
        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
    }
}
