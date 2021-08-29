package com.educandidoblog.educandidoblog.models;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String title;
    @Column(columnDefinition = "LONGTEXT")
    private String content;
}
