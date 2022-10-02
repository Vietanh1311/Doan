package com.example.doantotnghiep.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RolesEnum {
    USER(0), USER_VIP(1), ADMIN(2);
    private final int value;
}
