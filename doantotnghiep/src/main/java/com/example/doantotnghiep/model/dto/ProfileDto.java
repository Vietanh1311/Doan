package com.example.doantotnghiep.model.dto;

import lombok.Data;

@Data
public class ProfileDto {
    private Long id;
    private String name;
    private Long price;
    private int toldSold;
    private int brandId;
    private String onfeetImage;
    private String isAvailable;
    private String productImage;
    private String slug;
}
