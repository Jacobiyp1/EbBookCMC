package com.cmc.ebshop.service;

import com.cmc.ebshop.common.exception.NotFoundException;
import com.cmc.ebshop.dto.response.book.BookDto;
import com.cmc.ebshop.dto.request.BookSearchRequest;

import java.util.List;

public interface IBookService {
    BookDto insertBook(BookDto bookDto);
    void updateBook(BookDto bookDto) throws NotFoundException;
    void deleteBook(String bookId) throws NotFoundException;
    List<BookDto> getBooks(Integer pageIndex, Integer pageSize, BookSearchRequest request);
}
