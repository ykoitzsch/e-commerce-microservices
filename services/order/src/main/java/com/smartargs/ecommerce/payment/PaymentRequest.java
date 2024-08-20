package com.smartargs.ecommerce.payment;

import com.smartargs.ecommerce.customer.CustomerResponse;
import com.smartargs.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}