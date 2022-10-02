package com.example.doantotnghiep.model.entity;

import com.example.doantotnghiep.constant.Discount;
import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "promotion")
public class PromotionEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "coupn_code")
    private String coupnCode;
    @Column(name = "discount_type")
    private Discount discountType;
    @Column(name = "discount_value")
    private  int discountValue;
    @Column(name = "is_active")
    private  int isActive;
    @Column(name = "is_public")
    private int isPublic;

}