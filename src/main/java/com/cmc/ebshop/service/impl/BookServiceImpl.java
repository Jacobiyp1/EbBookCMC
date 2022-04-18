package com.cmc.ebshop.service.impl;

import com.cmc.ebshop.dto.BookDto;
import com.cmc.ebshop.mapper.IBookMapper;
import com.cmc.ebshop.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookMapper bookMapper;

    @Override
    public BookDto insertBook(BookDto bookDto) {
        if (true) {

        }
        bookMapper.insertBook(bookDto);
        return bookDto;
    }
}
