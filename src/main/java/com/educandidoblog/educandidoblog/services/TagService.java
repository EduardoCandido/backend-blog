package com.educandidoblog.educandidoblog.services;

import com.educandidoblog.educandidoblog.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {

    @Autowired
    TagRepository tagRepository;


}
