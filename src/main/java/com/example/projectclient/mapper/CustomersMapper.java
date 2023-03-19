package com.example.projectclient.mapper;

import com.example.projectclient.dto.CustomersDto;
import com.example.projectclient.model.Customers;
import org.springframework.stereotype.Component;

@Component
public class CustomersMapper {
    public CustomersDto convertCustomersToDto(Customers customers) {
        return CustomersDto.builder()
                .id(customers.getId())
                .name(customers.getName())
                .email(customers.getEmail())
                .phoneNumber(customers.getPhoneNumber())
                .address(customers.getAddress())
                .city(customers.getCity())
                .descriptions(customers.getDescriptions())
                .country(customers.getCountry())
                .type(customers.getType())
                .website(customers.getWebsite())
                .INN(customers.getINN())
                .build();
    }

    public Customers convertDtoToCustomers(CustomersDto customersDto) {
        return Customers.builder()
                .id(customersDto.getId())
                .name(customersDto.getName())
                .email(customersDto.getEmail())
                .phoneNumber(customersDto.getPhoneNumber())
                .address(customersDto.getAddress())
                .city(customersDto.getCity())
                .descriptions(customersDto.getDescriptions())
                .country(customersDto.getCountry())
                .type(customersDto.getType())
                .website(customersDto.getWebsite())
                .INN(customersDto.getINN())
                .build();
    }
}
