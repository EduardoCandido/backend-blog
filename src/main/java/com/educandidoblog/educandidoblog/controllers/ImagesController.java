package com.educandidoblog.educandidoblog.controllers;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/images")
public class ImagesController {

    @GetMapping
    @RequestMapping(value = "/post/{id}")
    public ResponseEntity<byte[]> getPostImage(@PathVariable Long id) throws IOException {
        String uploadsDir = "D:/projetos/educandido-blog/backend/src/main/resources/static/images/posts/" + id + ".jpeg";
        File file = new File(uploadsDir);
        if(file.exists()){
            ClassPathResource imgFile = new ClassPathResource("/static/images/posts/" + id + ".jpeg");
            byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.IMAGE_JPEG)
                    .body(bytes);
        }
        return  ResponseEntity.notFound().build();
    }
}
