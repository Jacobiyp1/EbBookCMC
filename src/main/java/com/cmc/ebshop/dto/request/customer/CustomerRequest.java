package com.cmc.ebshop.dto.request.customer;

import com.cmc.ebshop.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
    private String name;
    private String email;
    private String phoneNumber;

    public Customer toCustomer() {
        return new Customer(
                UUID.randomUUID().toString(),
                this.email,
                this.phoneNumber,
                this.name,
                ""
        );
    }
}
