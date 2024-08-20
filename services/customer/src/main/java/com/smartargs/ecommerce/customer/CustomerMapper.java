package com.smartargs.ecommerce.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public static Customer toCustomer(CustomerRequest request) {
        if (request == null) {
            return null;
        }
        return Customer.builder()
                .id(request.id()).firstName(request.firstName())
                .email(request.email())
                .lastName(request.lastName()).address(request.address()).build();
    }

    public static CustomerResponse fromCustomer(Customer customer) {
        return new CustomerResponse(customer.getId(), customer.getFirstName(), customer.getLastName(),customer.getEmail(), customer.getAddress());
    }
}
