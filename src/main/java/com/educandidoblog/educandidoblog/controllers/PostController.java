package com.educandidoblog.educandidoblog.controllers;

import com.educandidoblog.educandidoblog.models.Post;
import com.educandidoblog.educandidoblog.models.dto.PostRequestDto;
import com.educandidoblog.educandidoblog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    @RequestMapping("/new")
    public ResponseEntity<Post> createNewPost(){
        Post post = postService.getNewPost();
        return ResponseEntity.ok(post);
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id){
        Post post = postService.getPostById(id);
        return ResponseEntity.ok(post);
    }

    @PostMapping()
    public ResponseEntity<Post> savePost(@RequestBody @Valid PostRequestDto postForm){
        Post post = new Post(postForm);
        postService.save(post);
        return ResponseEntity.ok(post);
    }
}
