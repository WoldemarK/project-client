package com.example.projectclient.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee_company")
public class CustomersEmployee {
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
    @Column(name = "description")
    private String descriptions;
    @Column(name = "post")
    private String post;
    @Column(name = "department")
    private String department;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_customers",
            joinColumns = @JoinColumn(name = "employee_company"),
            inverseJoinColumns = @JoinColumn(name = "customers"))
    private List<Customers> customers;

    public void addCustomers(Customers _customers) {
        if (this.customers == null)
            this.customers = new ArrayList<>();
        this.customers.add(_customers);
    }

}
