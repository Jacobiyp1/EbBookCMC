package com.cmc.ebshop.mapper;

import com.cmc.ebshop.dto.Author.AuthorDto;
import com.cmc.ebshop.dto.BookDto;
import com.cmc.ebshop.entity.Author;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IAuthorMapper {
    void insertAuthor(@Param("author") AuthorDto authorDto);
    void updateAuthor(@Param("author") AuthorDto authorDto);
    void deleteAuthor(@Param("author") AuthorDto authorDto);
    Author getAuthor(@Param("id") String id);
    int getNumberOfBookBelongToAuthor(@Param("id") String id);
    List<BookDto> top3BestSale(@Param("id") String id);
    boolean isExistsAuthor(@Param("id") String id);
    boolean isExistsBooksOfAuthor(@Param("id") String id);
}
