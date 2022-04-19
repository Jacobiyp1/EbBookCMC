package com.cmc.ebshop.controller;


import com.cmc.ebshop.common.exception.CannotDeleteException;
import com.cmc.ebshop.common.exception.NotFoundException;
import com.cmc.ebshop.dto.Author.AuthorDto;
import com.cmc.ebshop.dto.ResponseBodyDto;
import com.cmc.ebshop.dto.param.AuthorParam;
import com.cmc.ebshop.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    IAuthorService authorService;

    @PostMapping()
    public ResponseEntity<ResponseBodyDto> insertAuthor(@RequestBody AuthorParam authorParam) {
        ResponseBodyDto responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), authorService.insertAuthor(authorParam));
        return new ResponseEntity<>(responseBodyDto, HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<ResponseBodyDto> updateAuthor(@RequestBody AuthorDto authorDto) throws NotFoundException {
        ResponseBodyDto responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), authorService.updateAuthor(authorDto));
        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<ResponseBodyDto> deleteAuthor(@RequestBody AuthorDto authorDto) throws CannotDeleteException, NotFoundException {
        ResponseBodyDto responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), authorService.deleteAuthor(authorDto));
        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseBodyDto> getAuthor(@PathVariable("id") String authorId) throws NotFoundException {
        ResponseBodyDto responseBodyDto = new ResponseBodyDto("Success", HttpStatus.OK.value(), authorService.getAuthor(authorId));
        return new ResponseEntity<>(responseBodyDto, HttpStatus.OK);
    }
}

