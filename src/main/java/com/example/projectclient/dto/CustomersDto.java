package com.example.projectclient.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomersDto {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String descriptions;
    private String country;
    private String type;
    private String website;
    private Long INN;
}
