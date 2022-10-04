package com.example.doantotnghiep.model.dto;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class FinanceDto {
    private Long id;
    private Long amount;
    private Date createrAt;
    private Date getCreaterBy;
    private Long orderId;
}
