package com.cmc.ebshop.controller;

import com.cmc.ebshop.dto.BookDto;
import com.cmc.ebshop.dto.ResponseBodyDto;
import com.cmc.ebshop.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @PostMapping
    public ResponseEntity<ResponseBodyDto> insertBook(@RequestBody BookDto bookDto) {
        ResponseBodyDto responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), bookService.insertBook(bookDto));
        return new ResponseEntity<>(responseBodyDto, HttpStatus.CREATED);
    }
}
