package com.example.doantotnghiep.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data

@Entity
@Table(name = "image")
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "link")
    private String Link;
    @Column(name = "size")
    private int size;
    @Column(name = "type")
    private String type;
    @Column(name = "uploaded_at")
    private  Date uploadedAt;
    @Column(name = "upload_by")
    private Long uploadBy;


}
