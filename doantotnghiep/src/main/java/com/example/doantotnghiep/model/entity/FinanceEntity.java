package com.example.doantotnghiep.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "finance")
public class FinanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "amount")
    private Long amount;
    @Column(name = "created_at")
    private Date createrAt;
    @Column(name = "created_by")
    private Date getCreaterBy;
    @Column(name = "order_id")
    private Long orderId;
}
