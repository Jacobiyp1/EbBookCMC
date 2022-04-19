package com.cmc.ebshop.mapper;

import com.cmc.ebshop.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IOrderMapper {
    void insertOrder(@Param("order") Orders order);
}
