package com.cmc.ebshop.controller;

import com.cmc.ebshop.common.exception.NotFoundException;
import com.cmc.ebshop.dto.ResponseBodyDto;
import com.cmc.ebshop.dto.request.order.OrderRequest;
import com.cmc.ebshop.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @PostMapping()
    public ResponseEntity<ResponseBodyDto> createOrder(@RequestBody OrderRequest orderRequest) throws NotFoundException {
        ResponseBodyDto responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), orderService.createOrder(orderRequest));
        return new ResponseEntity<>(responseBodyDto, HttpStatus.CREATED);
    }
}
