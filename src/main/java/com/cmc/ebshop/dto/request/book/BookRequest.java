package com.cmc.ebshop.dto.request.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
    private String id;
    private Integer buyQuantity;
}
