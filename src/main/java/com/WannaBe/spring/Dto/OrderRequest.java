package com.WannaBe.spring.Dto;

import com.WannaBe.spring.entity.Customer;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
    private Customer customer;

    public Customer getCustomer() {
        return this.customer;
    }
}
