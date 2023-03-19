package com.example.projectclient.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
public class Customers {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "description")
    private String descriptions;
    @Column(name = "country")
    private String country;
    @Column(name = "type")
    private String type;
    @Column(name = "website")
    private String website;
    @Column(name = "inn")
    private Long INN;

    @CreationTimestamp
    @Column(name = "creation_date", columnDefinition = "DATE")
    private LocalDate creation = LocalDate.now();

    @UpdateTimestamp
    @Column(name = "update_date", columnDefinition = "DATE")
    private LocalDate update = LocalDate.now();
}
