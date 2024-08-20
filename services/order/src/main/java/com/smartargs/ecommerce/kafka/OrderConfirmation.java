package com.smartargs.ecommerce.kafka;

import com.smartargs.ecommerce.customer.CustomerResponse;
import com.smartargs.ecommerce.order.PaymentMethod;
import com.smartargs.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
