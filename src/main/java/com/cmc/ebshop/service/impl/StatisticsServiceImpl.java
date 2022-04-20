package com.cmc.ebshop.service.impl;

import com.cmc.ebshop.dto.response.statistics.*;
import com.cmc.ebshop.mapper.IStatisticsMapper;
import com.cmc.ebshop.service.IStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticsServiceImpl implements IStatisticsService {

    @Autowired
    private IStatisticsMapper statisticsMapper;

    @Override
    public List<TopTenSellingBooks> getTopTenSellingBooks() {
        return statisticsMapper.getTopTenSellingBooks();
    }

    @Override
    public List<TopFiveAuthorSellingBooks> getTopFiveAuthorSellingBooks() {
        return statisticsMapper.getTopFiveAuthorSellingBooks();
    }

    @Override
    public List<TopFivePublisherSellingBooks> getTopFivePublisherSellingBooks() {
        return statisticsMapper.getTopFivePublisherSellingBooks();
    }

    @Override
    public List<TopFiveCustomerBuyBooks> getTopFiveCustomerBuyBooks() {
        return statisticsMapper.getTopFiveCustomerBuyBooks();
    }

    @Override
    public List<TopFiveCustomerHighestInvoiceValue> getTopFiveCustomerHighestInvoiceValue() {
        return statisticsMapper.getTopFiveCustomerHighestInvoiceValue();
    }
}
