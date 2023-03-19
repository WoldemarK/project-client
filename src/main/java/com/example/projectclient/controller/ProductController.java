package com.example.projectclient.controller;

import com.example.projectclient.model.Product;
import com.example.projectclient.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/help")
    public String message() {
        return "TestControler";
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> showAllProducts() {
        return new ResponseEntity<>(productService.showAllProducts(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return new ResponseEntity<>(productService.create(product), HttpStatus.CREATED);
    }
}
