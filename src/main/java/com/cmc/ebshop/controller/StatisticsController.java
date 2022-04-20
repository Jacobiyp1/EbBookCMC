package com.cmc.ebshop.controller;

import com.cmc.ebshop.dto.ResponseBodyDto;
import com.cmc.ebshop.dto.response.invoice.InvoiceResponse;
import com.cmc.ebshop.dto.response.statistics.TopTenSellingBooks;
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

    @GetMapping
    public ResponseEntity<ResponseBodyDto<TopTenSellingBooks>> getTopTenSellingBooks() {
        ResponseBodyDto<TopTenSellingBooks> responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), statisticsService.getTopTenSellingBooks());
        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
    }
}
