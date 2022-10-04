package com.example.doantotnghiep.model.dto;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class PostDto {
    private Long id;
    private String context;
    private Date createrAt;
    private String description;
    private Date modifiedAt;
    private Date publisherAt;
    private String slug;
    private int status;
    private String thumbnail;
    private String title;
    private Long modifiedBy;
    private Long createrBy;
}
