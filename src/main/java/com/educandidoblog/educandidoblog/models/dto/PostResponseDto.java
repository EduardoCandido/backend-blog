package com.educandidoblog.educandidoblog.models.dto;

import com.educandidoblog.educandidoblog.models.Post;
import com.educandidoblog.educandidoblog.models.Tag;
import com.educandidoblog.educandidoblog.models.User;

import java.util.List;

public class PostResponseDto {

    private Long id;
    private String title;
    private String content;
    private List<Tag> tags;
    private User user;

    public PostResponseDto(Long id, String title, String content, List<Tag> tags, User user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.user = user;
    }

    public PostResponseDto(Post post){
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.tags = post.getTags();
        this.user = post.getUser();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
