package com.cmc.ebshop.mapper;

import com.cmc.ebshop.dto.response.statistics.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStatisticsMapper {
    List<TopTenSellingBooks> getTopTenSellingBooks();

    List<TopFiveAuthorSellingBooks> getTopFiveAuthorSellingBooks();

    List<TopFivePublisherSellingBooks> getTopFivePublisherSellingBooks();

    List<TopFiveCustomerBuyBooks> getTopFiveCustomerBuyBooks();

    List<TopFiveCustomerHighestInvoiceValue> getTopFiveCustomerHighestInvoiceValue();
}
