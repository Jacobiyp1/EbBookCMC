package com.cmc.ebshop.service;


import com.cmc.ebshop.common.exception.CannotDeleteException;
import com.cmc.ebshop.common.exception.NotFoundException;
import com.cmc.ebshop.dto.response.author.AuthorDto;
import com.cmc.ebshop.dto.response.author.AuthorInfoDto;
import com.cmc.ebshop.dto.request.AuthorParam;

public interface IAuthorService {
    AuthorDto insertAuthor(AuthorParam authorParam);

    AuthorDto updateAuthor(AuthorDto authorDto) throws NotFoundException;

    AuthorDto deleteAuthor(AuthorDto authorDto) throws NotFoundException, CannotDeleteException;

    AuthorInfoDto getAuthor(String authorId) throws NotFoundException;

    boolean isExistsAuthor(String id);
}
