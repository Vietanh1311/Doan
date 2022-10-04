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
@Table(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "content")
    private String context;
    @Column(name = "created_at")
    private Date createrAt;
    @Column(name = "description")
    private String description;
    @Column(name = "modified_at")
    private Date modifiedAt;
    @Column(name = "publisher_at")
    private Date publisherAt;
    @Column(name = "slug")
    private String slug;
    @Column(name = "status")
    private int status;
    @Column(name = "thumbnail")
    private String thumbnail;
    @Column(name = "title")
    private String title;
    @Column(name = "modified_by")
    private Long modifiedBy;
    @Column(name = "creater_by")
    private Long createrBy;
}
