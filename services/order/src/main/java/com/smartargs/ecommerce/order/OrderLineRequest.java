package com.smartargs.ecommerce.order;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record OrderLineRequest(Integer id,  Integer orderId, Integer productId,
                               double quantity) {
}
