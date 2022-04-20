package com.cmc.ebshop.service;

import com.cmc.ebshop.dto.response.statistics.*;

import java.util.List;

public interface IStatisticsService {
    List<TopTenSellingBooks> getTopTenSellingBooks();

    List<TopFiveAuthorSellingBooks> getTopFiveAuthorSellingBooks();

    List<TopFivePublisherSellingBooks> getTopFivePublisherSellingBooks();

    List<TopFiveCustomerBuyBooks> getTopFiveCustomerBuyBooks();

    List<TopFiveCustomerHighestInvoiceValue> getTopFiveCustomerHighestInvoiceValue();
}
