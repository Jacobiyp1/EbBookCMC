package com.cmc.ebshop.dto.request.order;

import com.cmc.ebshop.dto.request.book.BookRequest;
import com.cmc.ebshop.dto.request.customer.CustomerRequest;
import com.cmc.ebshop.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<BookRequest> bookRequests;
    private CustomerRequest customerRequest;

    public Orders toOrder(String customerId) {
        return new Orders(
                UUID.randomUUID().toString(),
                customerId,
                "Pending"
        );
    }
}
