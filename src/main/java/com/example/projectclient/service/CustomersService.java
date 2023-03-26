package com.example.projectclient.service;

import com.example.projectclient.dto.CustomersDto;
import com.example.projectclient.mapper.CustomersMapper;
import com.example.projectclient.model.Customers;
import com.example.projectclient.repository.CustomersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomersService {
    private final CustomersRepository customersRepository;
    private final CustomersMapper mapper;

    public List<CustomersDto> showAll() {
        return customersRepository.findAll()
                .stream()
                .map(mapper::convertCustomersToDto)
                .collect(Collectors.toList());
    }


    public CustomersDto create(Customers customers) {
        return mapper.convertCustomersToDto(customersRepository.save(customers));
    }
}
