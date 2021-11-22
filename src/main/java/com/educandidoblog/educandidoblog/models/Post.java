package com.educandidoblog.educandidoblog.models;

import com.educandidoblog.educandidoblog.models.dto.PostRequestDto;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "release_date")
    private LocalDate releaseDate = LocalDate.now();

    @Column(columnDefinition = "LONGTEXT")
    private String content;

    @OneToMany
    @JoinTable(name = "Post_Tag",
        joinColumns = @JoinColumn(name = "post_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags;

    @ManyToOne()
    private User user;

    public Post() {
    }

    public Post(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Post(PostRequestDto postForm) {
        this.id = postForm.getId();
        this.title = postForm.getTitle();
        this.content = postForm.getContent();
        this.user = new User();
        this.user.setId(postForm.getUserId());
        this.tags = postForm.getTags();
    }

    public Long getId() {
        return this.id;
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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
