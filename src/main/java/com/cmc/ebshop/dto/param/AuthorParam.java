package com.cmc.ebshop.dto.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public
class AuthorParam {

    @NotBlank(message = "can't be empty")
    private String name;

}
