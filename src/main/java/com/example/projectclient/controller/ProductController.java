package com.example.projectclient.controller;

import com.example.projectclient.dto.ProductDto;
import com.example.projectclient.model.Product;
import com.example.projectclient.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;


    @GetMapping("/all")
    public ResponseEntity<List<ProductDto>> showAllProducts() {
        return new ResponseEntity<>(productService.showAllProducts(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ProductDto> create(@RequestBody Product product) {
        return new ResponseEntity<>(productService.create(product), HttpStatus.CREATED);
    }
}
