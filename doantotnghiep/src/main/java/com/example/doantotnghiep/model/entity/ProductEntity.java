package com.example.doantotnghiep.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "decription")
    private Long price;
    @Column(name = "told_sold")
    private int toldSold;
    @Column(name = "brand_id")
    private int brandId;
    @Column(name = "onfeet_image")
    private String onfeetImage;
    @Column(name = "is_available")
    private String isAvailable;
    @Column(name = "product_image")
    private String productImage;
    @Column(name = "slug")
    private String slug;

}
