package com.horizon.ecommerceproject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="NAME OF PRODUCT")
    private String name;
    @Column(name="CATEGORY OF PRODUCT")
    private String category;
    @Column(name="NEW PRICE")
    private Long new_price;
    @Column(name="OLD PRICE")
    private Long old_price;
    @Column(name="IMAGE")
    private String image;
}
