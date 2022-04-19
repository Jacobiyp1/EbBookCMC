package com.cmc.ebshop.dto.Author;

import com.cmc.ebshop.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AuthorInfoDto {
    private AuthorDto authorDto;
    private int numberOfBooks;
    private List<Book> top3BestSale;
}
