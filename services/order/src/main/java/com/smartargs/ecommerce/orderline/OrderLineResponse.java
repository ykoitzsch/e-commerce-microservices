package com.smartargs.ecommerce.orderline;

public record OrderLineResponse(
        Integer id,
        double quantity
) { }