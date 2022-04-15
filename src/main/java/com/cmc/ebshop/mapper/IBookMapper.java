package com.cmc.ebshop.mapper;

import com.cmc.ebshop.dto.BookDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IBookMapper {
    void insertBook(@Param("book")BookDto bookDto);
}
