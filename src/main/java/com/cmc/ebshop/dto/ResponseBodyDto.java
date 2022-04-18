package com.cmc.ebshop.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseBodyDto {
    private String message;
    private HttpStatus code;
    private Object item;

    public ResponseBodyDto() {
    }

    public ResponseBodyDto(String message, HttpStatus code) {
        this.message = message;
        this.code = code;
    }
}
