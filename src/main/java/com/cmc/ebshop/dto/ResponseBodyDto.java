package com.cmc.ebshop.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
public class ResponseBodyDto<E> {
    private String message;
    private Integer code;
    private E item;
    private List<E> items;

    public ResponseBodyDto() {
    }

    public ResponseBodyDto(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public ResponseBodyDto(String message, Integer code, E item) {
        this.message = message;
        this.code = code;
        this.item = item;
    }
}
