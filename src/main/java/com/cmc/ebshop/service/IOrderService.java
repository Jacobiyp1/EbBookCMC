package com.cmc.ebshop.service;

import com.cmc.ebshop.common.exception.NotFoundException;
import com.cmc.ebshop.dto.request.order.OrderRequest;

public interface IOrderService {
    OrderRequest createOrder(OrderRequest orderRequest) throws NotFoundException;
}
