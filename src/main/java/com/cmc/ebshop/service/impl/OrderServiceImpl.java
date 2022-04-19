package com.cmc.ebshop.service.impl;

import com.cmc.ebshop.dto.request.book.BookRequest;
import com.cmc.ebshop.dto.request.order.OrderRequest;
import com.cmc.ebshop.dto.response.book.BookDto;
import com.cmc.ebshop.dto.response.customer.CustomerDto;
import com.cmc.ebshop.entity.OrderDetail;
import com.cmc.ebshop.entity.Orders;
import com.cmc.ebshop.mapper.IBookMapper;
import com.cmc.ebshop.mapper.ICustomerMapper;
import com.cmc.ebshop.mapper.IOrderDetailMapper;
import com.cmc.ebshop.mapper.IOrderMapper;
import com.cmc.ebshop.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    IOrderDetailMapper orderDetailMapper;

    @Autowired
    IOrderMapper orderMapper;

    @Autowired
    ICustomerMapper customerMapper;

    @Autowired
    IBookMapper bookMapper;

    @Override
    public OrderRequest createOrder(OrderRequest orderRequest) {
        // create customer if they don't exist
        if (!customerMapper.isExistsCustomer(orderRequest.getCustomerRequest().getEmail())) {
            customerMapper.insertCustomer(orderRequest.getCustomerRequest().toCustomer());
        }
        CustomerDto customerDto = customerMapper.findByEmail(orderRequest.getCustomerRequest().getEmail());
        Orders order = orderRequest.toOrder(customerDto.getId());
        orderMapper.insertOrder(order);
        List<OrderDetail> orderDetails = new ArrayList<>();
        for (BookRequest bookRequest : orderRequest.getBookRequests()) {
            BookDto bookDto = bookMapper.findById(bookRequest.getId());
            orderDetails.add(new OrderDetail(UUID.randomUUID().toString(), order.getId(), bookRequest.getId(), bookRequest.getBuyQuantity(), bookDto.getPrice()));
            bookDto.setQuantitySold(bookDto.getQuantitySold() + bookRequest.getBuyQuantity());
            bookMapper.updateBook(bookDto);
        }
        orderDetailMapper.createOrderDetail(orderDetails);
        return orderRequest;
    }
}
