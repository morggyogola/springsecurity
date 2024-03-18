package com.example.springsecurity.services;

import com.example.springsecurity.entities.User;
import lombok.Value;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.HashMap;
import java.util.Map;

public interface JWTService {
//    @Value("${security.jwt.secret-key}")
//    String secretKey;
//
//    @Value("${security.jwt.expiration-time}")
//     long jwtExpiration;
    String extractUserName(String token);

    String generateToken(UserDetails userDetails);

    boolean isTokenValid(String token, UserDetails userDetails);

    String generateRefreshToken(Map<String,Object> extraClaims, UserDetails userDetails);


}
