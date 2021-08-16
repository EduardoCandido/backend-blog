package com.educandidoblog.educandidoblog.controllers;

import com.educandidoblog.educandidoblog.models.dto.UserResponseDto;
import com.educandidoblog.educandidoblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserResponseDto> list(){
        List<UserResponseDto> userResponseDtos = new ArrayList<>();
        this.userRepository.findAll().forEach(user -> {
            UserResponseDto userResponseDto = new UserResponseDto(user);
            userResponseDtos.add(userResponseDto);
        });
        return userResponseDtos;
    }
}
