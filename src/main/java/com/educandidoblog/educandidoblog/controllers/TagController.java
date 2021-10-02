package com.educandidoblog.educandidoblog.controllers;

import com.educandidoblog.educandidoblog.models.Tag;
import com.educandidoblog.educandidoblog.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {

    @Autowired
    TagService tagService;

    @GetMapping
    public List<Tag> listByName(){
        return null;
    }
}
