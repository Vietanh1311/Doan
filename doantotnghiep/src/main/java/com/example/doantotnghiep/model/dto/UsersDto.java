package com.example.doantotnghiep.model.dto;

import com.example.doantotnghiep.constant.RolesEnum;
import lombok.Data;

import javax.persistence.Column;

@Data
public class UsersDto {
    private Long id;
    private String fullName;
    private String email;
    private String passWord;
    private RolesEnum roles;
    private String address;
    private String phone;
    private boolean status;
}
