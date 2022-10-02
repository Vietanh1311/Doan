package com.example.doantotnghiep.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Discount {
    Discount20 (0), Discount50(1), Discount100(2);
    private final int value;
}
