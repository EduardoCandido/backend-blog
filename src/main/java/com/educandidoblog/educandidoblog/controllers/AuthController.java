package com.educandidoblog.educandidoblog.controllers;

import com.educandidoblog.educandidoblog.models.dto.TokenResponseDto;
import com.educandidoblog.educandidoblog.models.dto.UserRequestDto;
import com.educandidoblog.educandidoblog.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping
    public ResponseEntity<TokenResponseDto> createAuthenticationToken(@RequestBody UserRequestDto loginForm) throws Exception {
        final String token = authenticationService.createAuthenticationToken(loginForm.getEmail(), loginForm.getPassword());
        TokenResponseDto tokenResponseDto = new TokenResponseDto(token);
        return ResponseEntity.ok(tokenResponseDto);
    }
}
