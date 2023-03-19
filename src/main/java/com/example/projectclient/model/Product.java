package com.example.projectclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;


@Entity
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

    public Product(String name, String vendorCode, Long count,
                   double price, String guarantee, boolean available, String description, LocalDate receiptDate) {
        this.name = name;
        this.vendorCode = vendorCode;
        this.count = count;
        this.price = price;
        this.guarantee = guarantee;
        this.available = available;
        this.description = description;
        this.receiptDate = receiptDate;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vendorCode='" + vendorCode + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", guarantee='" + guarantee + '\'' +
                ", available=" + available +
                ", description='" + description + '\'' +
                ", receiptDate=" + receiptDate +
                '}';
    }
}
