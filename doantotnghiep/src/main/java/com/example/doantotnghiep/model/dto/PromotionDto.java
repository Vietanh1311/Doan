package com.example.doantotnghiep.model.dto;

import com.example.doantotnghiep.constant.Discount;
import lombok.Data;

import javax.persistence.Column;

@Data
public class PromotionDto {
    private Long id;
    private String name;
    private String coupnCode;
    private Discount discountType;
    private  int discountValue;
    private  int isActive;
    private int isPublic;
}
