package com.cmc.ebshop.service;

import com.cmc.ebshop.common.exception.NotFoundException;
import com.cmc.ebshop.dto.BookDto;

public interface IBookService {
    BookDto insertBook(BookDto bookDto);
    void updateBook(BookDto bookDto) throws NotFoundException;
<<<<<<< HEAD
    void deleteBook(String bookId) throws NotFoundException;
=======
>>>>>>> d9297e4f00894d5ce9465dd4b0ea6d514497167c
}
