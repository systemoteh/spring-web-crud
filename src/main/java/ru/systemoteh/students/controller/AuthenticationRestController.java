package ru.systemoteh.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import ru.systemoteh.students.config.JwtTokenProvider;
import ru.systemoteh.students.dto.AuthenticationRequestDto;
import ru.systemoteh.students.dto.AuthenticationResponseDto;

@RestController
@RequestMapping("/auth")
public class AuthenticationRestController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthenticationRequestDto requestDto) {
        try {
            String username = requestDto.getUsername();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, requestDto.getPassword()));
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);

            if (userDetails == null) {
                throw new UsernameNotFoundException("User with username: " + username + " not found");
            }

            String token = jwtTokenProvider.createToken(userDetails);

            AuthenticationResponseDto responseDto = new AuthenticationResponseDto();
            responseDto.setUsername(username);
            responseDto.setToken(token);

            // without Data Transfer Object (DTO)
//            Map<Object, Object> responseDto = new HashMap<>();
//            responseDto.put("username", username);
//            responseDto.put("token", token);

            return ResponseEntity.ok(responseDto);
        } catch (AuthenticationException e) {
            throw new BadCredentialsException("Invalid username or password");
        }
    }
}
