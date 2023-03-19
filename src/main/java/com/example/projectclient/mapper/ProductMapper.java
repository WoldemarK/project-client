package com.example.projectclient.mapper;

import com.example.projectclient.dto.ProductDto;
import com.example.projectclient.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDto convertProductToDto(Product product) {
        return ProductDto.builder()
               // .id(product.getId())
                .name(product.getName())
                .vendorCode(product.getVendorCode())
                .count(product.getCount())
                .price(product.getPrice())
                .guarantee(product.getGuarantee())
                .available(product.isAvailable())
                .description(product.getDescription())
                .type(product.getType())
                .build();
    }

    public Product convertDtoToProduct(ProductDto productDto) {
        return Product.builder()
                .name(productDto.getName())
                .vendorCode(productDto.getVendorCode())
                .count(productDto.getCount())
                .price(productDto.getPrice())
                .guarantee(productDto.getGuarantee())
                .available(productDto.isAvailable())
                .description(productDto.getDescription())
                .type(productDto.getType())
                .build();
    }
}
