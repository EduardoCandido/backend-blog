package com.educandidoblog.educandidoblog.controllers;

import com.educandidoblog.educandidoblog.models.Tag;
import com.educandidoblog.educandidoblog.models.dto.TagDto;
import com.educandidoblog.educandidoblog.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tags")
public class TagController {

    @Autowired
    TagService tagService;

    @GetMapping
    public ResponseEntity<List<TagDto>> list(){
        List<TagDto> tags = tagService.listAll().stream().map(Tag::convertToDto).collect(Collectors.toList());
        return ResponseEntity.ok(tags);
    }

    @PostMapping
    public ResponseEntity<TagDto> save(@RequestBody @Valid TagDto tagForm){
        Tag tag = new Tag(tagForm);
        tag = this.tagService.save(tag);
        return ResponseEntity.ok(tag.convertToDto());
    }
}
