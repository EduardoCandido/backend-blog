package com.educandidoblog.educandidoblog.models.dto;

import com.educandidoblog.educandidoblog.models.Tag;

import javax.validation.constraints.NotNull;
import java.util.List;

public class PostRequestDto {

    private Long id;

    @NotNull(message = "Título obrigatório")
    private String title;

    @NotNull(message = "Conteúdo obrigatório")
    private String content;

    @NotNull(message = "Autor obrigatório")
    private Long userId;

    @NotNull(message = "Selecione ao menos uma tag")
    private List<Tag> tags;

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
