package com.cmc.ebshop.controller;

import com.cmc.ebshop.dto.BookDto;
import com.cmc.ebshop.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @PostMapping
    public ResponseEntity<BookDto> insertBook(@RequestBody BookDto bookDto) {
        bookService.insertBook(bookDto);
        return new ResponseEntity<>(bookDto, HttpStatus.OK);
    }
}
