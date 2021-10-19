package com.educandidoblog.educandidoblog.models;

import com.educandidoblog.educandidoblog.models.dto.TagDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Tag(){

    }

    public Tag(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Tag(TagDto tagForm) {
        this.id = tagForm.getId();
        this.name = tagForm.getName();
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

    public TagDto convertToDto(){
        TagDto tagDto = new TagDto(this.id, this.name);
        return tagDto;
    }
}
