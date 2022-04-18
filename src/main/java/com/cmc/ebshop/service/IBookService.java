package com.cmc.ebshop.service;

import com.cmc.ebshop.common.exception.NotFoundException;
import com.cmc.ebshop.dto.BookDto;

public interface IBookService {
    BookDto insertBook(BookDto bookDto);
    void updateBook(BookDto bookDto) throws NotFoundException;
    void deleteBook(String bookId) throws NotFoundException;
}
