package com.cmc.ebshop.mapper;

import com.cmc.ebshop.dto.BookDto;
import com.cmc.ebshop.dto.request.BookSearchRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IBookMapper {
    void insertBook(@Param("book") BookDto bookDto);
    void updateBook(@Param("book") BookDto bookDto);
    boolean existsBookById(@Param("bookId") String bookId);
    BookDto findById(@Param("bookId") String bookId);
    List<BookDto> getBooks(@Param("request") BookSearchRequest request, @Param("offset") Integer offset, @Param("size") Integer size);
}
