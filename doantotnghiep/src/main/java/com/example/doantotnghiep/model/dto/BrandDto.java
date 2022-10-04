package com.example.doantotnghiep.model.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class BrandDto {
    private Long id;
    private String name;
    private String thumbnail;
}
