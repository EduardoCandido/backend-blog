package com.educandidoblog.educandidoblog.controllers;

import com.educandidoblog.educandidoblog.models.Post;
import com.educandidoblog.educandidoblog.models.dto.PostRequestDto;
import com.educandidoblog.educandidoblog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping()
    public ResponseEntity<Post> savePost(@RequestBody @Valid PostRequestDto postForm){
        Post post = new Post(postForm);
        postService.save(post);
        return ResponseEntity.ok(post);
    }
}
