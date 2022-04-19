package com.cmc.ebshop.mapper;

import com.cmc.ebshop.dto.response.customer.CustomerDto;
import com.cmc.ebshop.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ICustomerMapper {
    void insertCustomer(@Param("customer") Customer customer);
    CustomerDto findByEmail(@Param("email") String email);
    boolean isExistsCustomer(@Param("email") String email);
}
