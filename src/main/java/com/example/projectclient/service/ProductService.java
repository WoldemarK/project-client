package com.example.projectclient.service;

import com.example.projectclient.model.Product;
import com.example.projectclient.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public void createAll(List<Product> products) {
        productRepository.saveAll(products);
    }

    public List<Product> showAllProducts() {
        return productRepository.findAll();
    }
}
