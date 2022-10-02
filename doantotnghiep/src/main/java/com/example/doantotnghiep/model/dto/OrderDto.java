package com.example.doantotnghiep.model.dto;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class OrderDto {
    private Long id;
    private Date createAt;
    private Date modifieAt;
    private String note;
    private Long productPrice;
    private String promotion;
    private String receiverName;
    private String receiverAddress;
    private String receiverPhone;
    private int size;
    private int status;
    private int totalPrice;
    private int buyer;
    private String productId;
}
