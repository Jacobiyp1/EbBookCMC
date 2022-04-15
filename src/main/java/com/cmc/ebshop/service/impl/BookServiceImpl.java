package com.cmc.ebshop.service.impl;

import com.cmc.ebshop.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookService bookService;


}
