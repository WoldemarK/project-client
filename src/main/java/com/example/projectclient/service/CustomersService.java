package com.example.projectclient.service;

import com.example.projectclient.model.Customers;
import com.example.projectclient.repository.CustomersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomersService {
    private final CustomersRepository customersRepository;


    public List<Customers> showAll() {
        return customersRepository.findAll();
    }


    public Customers create(Customers customers) {
        return customersRepository.save(customers);
    }
}
