package com.example.projectclient.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ProductDto {
  //  private Long id;
    private String name;
    private String vendorCode;
    private Long count;
    private double price;
    private String guarantee;
    private boolean available;
    private String description;
    private LocalDate receiptDate;
    private String type;
}
