package com.example.projectclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

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
    @NotEmpty(message = "Name should not be empty")
    @NotNull(message = "Name should not be empty")
    @Column(name = "name")
    private String name;
    @Column(name = "vendor_code")
    private String vendorCode;

    @Column(name = "count")
    private Long count;

    @Column(name = "price")
    private Double price;

    @Column(name = "guarantee")
    private String guarantee;
    @JsonProperty
    @Column(name = "available")
    private boolean available;
    @Column(name = "description")
    @Size(min = 2, max = 5000, message = "Description should be between 2 and 5000 characters")
    private String description;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "receipt_date")
    private Date receiptDate;
}
