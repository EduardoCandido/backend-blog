package com.educandidoblog.educandidoblog.services;

import com.educandidoblog.educandidoblog.models.User;
import com.educandidoblog.educandidoblog.models.dto.UserResponseDto;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponseDto getAuthenticatedUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = (User) authentication.getPrincipal();
        return new UserResponseDto(user);
    }
}
