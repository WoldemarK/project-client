package com.example.projectclient.service;

import com.example.projectclient.dto.ProductDto;
import com.example.projectclient.mapper.ProductMapper;
import com.example.projectclient.model.Product;
import com.example.projectclient.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductDto create(Product product) {
        return productMapper.convertProductToDto(productRepository.save(product));
    }

    public void createAll(List<Product> products) {
        productRepository.saveAll(products);
    }

    public List<ProductDto> showAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::convertProductToDto)
                .collect(Collectors.toList());
    }
}
