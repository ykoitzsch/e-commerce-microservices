package com.smartargs.ecommerce.product;

import com.smartargs.ecommerce.category.Category;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public static Product toProduct(ProductRequest request) {
        return Product.builder()
                .id(request.id())
                .name(request.name())
                .description(request.description())
                .price(request.price())
                .availableQuantity(request.availableQuantity())
                .category(
                        Category.builder()
                                .id(request.categoryId())
                                .build())
                .build();
    }

    public static ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getAvailableQuantity(), product.getPrice(), product.getCategory().getId(), product.getCategory().getName(), product.getCategory().getDescription());
    }

    public static ProductPurchaseResponse toProductPurchaseResponse(Product product, double quantity) {
        return new ProductPurchaseResponse(product.getId(), product.getName(), product.getDescription(), product.getPrice(), quantity);

    }
}
