package com.cmc.ebshop.service.impl;

import com.cmc.ebshop.common.exception.NotFoundException;
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

import java.math.BigDecimal;
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
    public OrderRequest createOrder(OrderRequest orderRequest) throws NotFoundException {
        CustomerDto customerDto = customerMapper.findByEmail(orderRequest.getCustomerRequest().getEmail());
        Orders order = orderRequest.toOrder(customerDto.getId());

        List<OrderDetail> orderDetails = new ArrayList<>();
        List<BookDto> bookDtos = new ArrayList<>();
        for (BookRequest bookRequest : orderRequest.getBookRequests()) {
            BookDto bookDto = bookMapper.findById(bookRequest.getId());
            if (bookRequest.getBuyQuantity() > bookDto.getQuantityCurrent()) {
                throw new NotFoundException("The book is out of stock");
            }
            orderDetails.add(new OrderDetail(UUID.randomUUID().toString(), order.getId(), bookRequest.getId(), bookRequest.getBuyQuantity(), bookDto.getPrice().multiply(BigDecimal.valueOf(bookRequest.getBuyQuantity()))));
            bookDto.setQuantitySold(bookDto.getQuantitySold() + bookRequest.getBuyQuantity());
            bookDtos.add(bookDto);
        }
        //update book
        for (BookDto bookDto : bookDtos) {
            bookMapper.updateBook(bookDto);
        }
        // create customer if they don't exist
        if (!customerMapper.isExistsCustomer(orderRequest.getCustomerRequest().getEmail())) {
            customerMapper.insertCustomer(orderRequest.getCustomerRequest().toCustomer());
        }
        orderMapper.insertOrder(order);
        orderDetailMapper.createOrderDetail(orderDetails);
        return orderRequest;
    }
}
