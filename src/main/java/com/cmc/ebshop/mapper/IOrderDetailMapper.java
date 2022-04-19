package com.cmc.ebshop.mapper;

import com.cmc.ebshop.dto.request.book.BookRequest;
import com.cmc.ebshop.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IOrderDetailMapper {
    void createOrderDetail(@Param("orderDetails") List<OrderDetail> orderDetails);
}
