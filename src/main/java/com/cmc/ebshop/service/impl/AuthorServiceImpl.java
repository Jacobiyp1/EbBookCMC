package com.cmc.ebshop.service.impl;

import com.cmc.ebshop.common.exception.CannotDeleteException;
import com.cmc.ebshop.common.exception.NotFoundException;
import com.cmc.ebshop.dto.response.author.AuthorInfoDto;
import com.cmc.ebshop.dto.request.author.AuthorRequest;
import com.cmc.ebshop.dto.response.author.AuthorDto;
import com.cmc.ebshop.mapper.IAuthorMapper;
import com.cmc.ebshop.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements IAuthorService {

    @Autowired
    IAuthorMapper authorMapper;

    @Override
    public AuthorDto insertAuthor(AuthorRequest authorRequest) {
        AuthorDto authorDto = new AuthorDto(authorRequest.getName());
        authorMapper.insertAuthor(authorDto);
        return authorDto;
    }

    @Override
    public AuthorDto updateAuthor(AuthorDto authorDto) throws NotFoundException {
        if (authorMapper.isExistsAuthor(authorDto.getId())) {
            authorMapper.updateAuthor(authorDto);
            return authorDto;
        }
        throw new NotFoundException("Author did not exists");
    }

    @Override
    public AuthorDto deleteAuthor(AuthorDto authorDto) throws NotFoundException, CannotDeleteException {
        if (authorMapper.isExistsBooksOfAuthor(authorDto.getId())) {
            throw new CannotDeleteException("Still have books of this author in system");
        } else if (authorMapper.isExistsAuthor(authorDto.getId())) {
            authorMapper.deleteAuthor(authorDto);
            return authorDto;
        } else {
            throw new NotFoundException("Author did not exists");
        }
    }

    @Override
    public AuthorInfoDto getAuthor(String authorId) throws NotFoundException {
        if (authorMapper.isExistsAuthor(authorId)) {
            AuthorInfoDto authorInfoDto = new AuthorInfoDto(authorMapper.getAuthor(authorId),
                    authorMapper.getNumberOfBookBelongToAuthor(authorId), authorMapper.top3BestSale(authorId));
            return authorInfoDto;
        } else {
            throw new NotFoundException("Author did not exists");
        }
    }

    @Override
    public boolean isExistsAuthor(String id) {
        return authorMapper.isExistsAuthor(id);
    }
}
