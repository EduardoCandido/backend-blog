package com.educandidoblog.educandidoblog.models.dto;

import javax.validation.constraints.NotNull;

public class PostRequestDto {

    private Long id;

    @NotNull(message = "Título obrigatório")
    private String title;
    @NotNull(message = "Conteúdo obrigatório")
    private String content;

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
}
