package com.cmc.ebshop.service.impl;

import com.cmc.ebshop.common.exception.NotFoundException;
import com.cmc.ebshop.dto.BookDto;
import com.cmc.ebshop.mapper.IBookMapper;
import com.cmc.ebshop.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookMapper bookMapper;

    @Override
    public BookDto insertBook(BookDto bookDto) {
        BookDto ob = bookMapper.findById(bookDto.getId());
        if (Objects.isNull(ob)) {
            bookMapper.insertBook(bookDto);
        } else {
            bookDto.setQuantityCurrent(bookDto.getQuantityCurrent() + ob.getQuantityCurrent());
            bookMapper.updateBook(bookDto);
        }
        return bookDto;
    }

    @Override
    public void updateBook(BookDto bookDto) throws NotFoundException {
        if (!bookMapper.existsBookById(bookDto.getId())) {
            throw new NotFoundException("Not found book id " + bookDto.getId());
        }
        bookMapper.updateBook(bookDto);
    }
}
