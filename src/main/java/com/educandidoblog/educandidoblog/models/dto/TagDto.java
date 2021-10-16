package com.educandidoblog.educandidoblog.models.dto;

import com.educandidoblog.educandidoblog.models.Tag;

import javax.validation.constraints.NotNull;

public class TagDto {

    private Long id;

    @NotNull(message =  "Tag deve conter um nome")
    private String name;

    public TagDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
