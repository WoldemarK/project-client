package com.example.projectclient.controller;

import com.example.projectclient.model.Customers;
import com.example.projectclient.repository.CustomersRepository;
import com.example.projectclient.service.CustomersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customers")
public class CustomersController {

    private final CustomersService customersService;

    @GetMapping("/all")
    public List<Customers> showAll() {
        return customersService.showAll();
    }

    @PostMapping("/create")
    public Customers create(@RequestBody Customers customers) {
        return customersService.create(customers);
    }
}
