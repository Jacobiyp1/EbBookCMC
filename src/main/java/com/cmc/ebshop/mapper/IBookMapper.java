package com.cmc.ebshop.mapper;

import com.cmc.ebshop.dto.BookDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IBookMapper {
    void insertBook(@Param("book") BookDto bookDto);
    void updateBook(@Param("book") BookDto bookDto);
    boolean existsBookById(@Param("bookId") String bookId);
    BookDto findById(@Param("bookId") String bookId);
    List<BookDto> filterBook();
}
