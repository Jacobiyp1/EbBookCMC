package com.cmc.ebshop.controller;

import com.cmc.ebshop.dto.ResponseBodyDto;
import com.cmc.ebshop.dto.response.statistics.*;
import com.cmc.ebshop.service.IStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    private IStatisticsService statisticsService;

    @GetMapping("/top-ten-selling-books")
    public ResponseEntity<ResponseBodyDto<TopTenSellingBooks>> getTopTenSellingBooks() {
        ResponseBodyDto<TopTenSellingBooks> responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), statisticsService.getTopTenSellingBooks());
        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
    }

    @GetMapping("/top-five-author-selling-books")
    public ResponseEntity<ResponseBodyDto<TopFiveAuthorSellingBooks>> getTopFiveAuthorSellingBooks() {
        ResponseBodyDto<TopFiveAuthorSellingBooks> responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), statisticsService.getTopFiveAuthorSellingBooks());
        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
    }

    @GetMapping("/top-five-publisher-selling-books")
    public ResponseEntity<ResponseBodyDto<TopFivePublisherSellingBooks>> getTopFivePublisherSellingBooks() {
        ResponseBodyDto<TopFivePublisherSellingBooks> responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), statisticsService.getTopFivePublisherSellingBooks());
        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
    }

    @GetMapping("/top-five-customer-buy-books")
    public ResponseEntity<ResponseBodyDto<TopFiveCustomerBuyBooks>> getTopFiveCustomerBuyBooks() {
        ResponseBodyDto<TopFiveCustomerBuyBooks> responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), statisticsService.getTopFiveCustomerBuyBooks());
        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
    }

    @GetMapping("/top-five-customer-highest-invoice-value")
    public ResponseEntity<ResponseBodyDto<TopFiveCustomerHighestInvoiceValue>> getTopFiveCustomerHighestInvoiceValue() {
        ResponseBodyDto<TopFiveCustomerHighestInvoiceValue> responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), statisticsService.getTopFiveCustomerHighestInvoiceValue());
        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
    }
}
