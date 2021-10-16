package com.educandidoblog.educandidoblog.services;

import com.educandidoblog.educandidoblog.models.Tag;
import com.educandidoblog.educandidoblog.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    @Autowired
    TagRepository tagRepository;


    public Tag save(Tag tag) {
        return tagRepository.save(tag);
    }

    public List<Tag> listAll() {
        return tagRepository.findAll();
    }
}
