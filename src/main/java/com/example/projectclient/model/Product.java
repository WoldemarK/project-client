package com.example.projectclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "vendor_code")
    private String vendorCode;
    @Column(name = "count")
    private Long count;
    @Column(name = "price")
    private double price;
    @Column(name = "guarantee")
    private String guarantee;
    @JsonProperty
    @Column(name = "available")
    private boolean available;
    @Column(name = "description")
    private String description;
    @Column(name = "receipt_date", columnDefinition = "DATE")
    private LocalDate receiptDate;
    @Column(name = "type")
    private String type;

}
