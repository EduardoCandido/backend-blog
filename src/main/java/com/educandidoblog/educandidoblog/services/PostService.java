package com.educandidoblog.educandidoblog.services;

import com.educandidoblog.educandidoblog.models.Post;
import com.educandidoblog.educandidoblog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public void save(Post post){
        this.postRepository.save(post);
    }
}
