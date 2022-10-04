package com.example.doantotnghiep.model.dto;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class ImageDto {
    private Long id;
    private String name;
    private String Link;
    private int size;
    private String type;
    private Date uploadedAt;
    private Long uploadBy;
}
