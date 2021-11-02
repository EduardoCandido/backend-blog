package com.educandidoblog.educandidoblog.services;

import com.educandidoblog.educandidoblog.models.Post;
import com.educandidoblog.educandidoblog.models.dto.PostResponseDto;
import com.educandidoblog.educandidoblog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
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

    public void savePostImage(MultipartFile file) throws IOException {
        if(!file.isEmpty()){
            String uploadsDir = "D:/projetos/educandido-blog/backend/src/main/resources/static/images/posts/" + file.getOriginalFilename() + ".jpeg";
            File convertedFile = new File(uploadsDir);
            if(convertedFile.exists()){
                convertedFile.delete();
            }
            convertedFile.createNewFile();
            try (FileOutputStream fileOutputStream = new FileOutputStream(convertedFile)) {
                fileOutputStream.write(file.getBytes());
            }catch (Exception error){
                error.printStackTrace();
            }
        }
    }

    public List<PostResponseDto> getPosts() {
        List<Post> posts = postRepository.findAll();
        List<PostResponseDto> postResponseDtos = new ArrayList<>();
        posts.forEach(post -> {
            PostResponseDto postResponseDto = new PostResponseDto(post);
            postResponseDtos.add(postResponseDto);
        });
        return postResponseDtos;
    }
}
