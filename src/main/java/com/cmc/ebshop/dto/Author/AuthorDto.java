package com.cmc.ebshop.dto.Author;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class AuthorDto {
    private String id;
    private String name;

    public AuthorDto(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public AuthorDto(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
