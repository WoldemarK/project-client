package com.example.projectclient.controller;

import com.example.projectclient.dto.CustomersDto;
import com.example.projectclient.model.Customers;
import com.example.projectclient.repository.CustomersRepository;
import com.example.projectclient.service.CustomersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customers")
public class CustomersController {

    private final CustomersService customersService;

    @GetMapping("/all")
    public ResponseEntity<List<CustomersDto>> showAll() {
        return new ResponseEntity<>(customersService.showAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<CustomersDto> create(@RequestBody Customers customers) {
        return new ResponseEntity<>(customersService.create(customers), HttpStatus.CREATED);
    }
}
