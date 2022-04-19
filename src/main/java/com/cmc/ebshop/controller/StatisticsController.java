package com.cmc.ebshop.controller;

import com.cmc.ebshop.service.IStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    private IStatisticsService statisticsService;

//    @GetMapping
//    public ResponseEntity<ResponseBodyDto<InvoiceResponse>> getInvoice(@RequestParam(name = "orderId", required = false) String orderId) {
//        ResponseBodyDto<InvoiceResponse> responseBodyDto = new ResponseBodyDto("Get invoice Success", HttpStatus.OK.value(), invoiceService.getInvoice(orderId));
//        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
//    }
}
