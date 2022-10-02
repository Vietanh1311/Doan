package com.example.doantotnghiep.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "create_at")
    private Date createAt;
    @Column(name = "modified_at")
    private Date modifieAt;
    @Column(name = "note")
    private String note;
    @Column(name = "product_price")
    private Long productPrice;
    @Column(name = "promotion")
    private String promotion;
    @Column(name = "receiver_name")
    private String receiverName;
    @Column(name = "receiver_address")
    private String receiverAddress;
    @Column(name = "receiver_phone")
    private String receiverPhone;
    @Column(name = "size")
    private int size;
    @Column(name = "status")
    private int status;
    @Column(name = "total_price")
    private int totalPrice;
    @Column(name = "buyer")
    private int buyer;
    @Column(name = "product_id")
    private String productId;
}