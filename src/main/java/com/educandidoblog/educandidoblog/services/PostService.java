package com.educandidoblog.educandidoblog.services;

import com.educandidoblog.educandidoblog.models.Post;
import com.educandidoblog.educandidoblog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public void save(Post post){
        this.postRepository.save(post);
    }

    public Post getNewPost() {
        Post post = new Post("New Post", "No Content");
        this.postRepository.save(post);
        post.setTitle("Post " + post.getId());
        this.postRepository.save(post);
        return post;
    }

    public Post getPostById(Long id) {
        Optional<Post> post = this.postRepository.findById(id);
        return post.get();
    }

    public List<Post> getPostsByUser(Long userId) {
        return this.postRepository.findPostsByUser(userId);
    }
}
