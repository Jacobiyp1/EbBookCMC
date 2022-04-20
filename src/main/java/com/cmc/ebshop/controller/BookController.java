package com.cmc.ebshop.controller;

import com.cmc.ebshop.common.exception.NotFoundException;
import com.cmc.ebshop.dto.response.book.BookDto;
import com.cmc.ebshop.dto.ResponseBodyDto;
import com.cmc.ebshop.dto.request.book.BookSearchRequest;
import com.cmc.ebshop.service.IBookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@Api(value = "Book Api")
public class BookController {

    @Autowired
    private IBookService bookService;

    @ApiOperation(value = "Thêm sách")
    @PostMapping
    public ResponseEntity<ResponseBodyDto<BookDto>> insertBook(@ApiParam(value = "Thêm sách") @RequestBody BookDto bookDto) {
        ResponseBodyDto<BookDto> responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), bookService.insertBook(bookDto));
        return new ResponseEntity<>(responseBodyDto, HttpStatus.CREATED);
    }

    @PatchMapping
    public ResponseEntity<ResponseBodyDto> updateBook(@RequestBody BookDto bookDto) throws NotFoundException {
        bookService.updateBook(bookDto);
        ResponseBodyDto responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value());
        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseBodyDto> deleteBook(@PathVariable("id") String bookId) throws NotFoundException {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>(new ResponseBodyDto("Delete Success", HttpStatus.OK.value()), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<ResponseBodyDto<BookDto>> getBooks(@RequestBody(required = false) BookSearchRequest request, @RequestParam("pageIndex") Integer pageIndex,
                                                    @RequestParam("pageSize") Integer pageSize) {
        ResponseBodyDto<BookDto> responseBodyDto = new ResponseBodyDto("Get book Success", HttpStatus.OK.value(), bookService.getBooks(pageIndex, pageSize, request));
        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
    }
}
