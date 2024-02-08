package com.example.springsecurity.controller;

import com.example.springsecurity.dto.SignUpRequest;
import com.example.springsecurity.entities.User;
import com.example.springsecurity.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
@RestController
public class AuthenticationController {

    private  final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest){
        return  ResponseEntity.ok(authenticationService.signup(signUpRequest));
    }
}
