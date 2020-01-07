package ru.systemoteh.students.dto;

import lombok.Data;

@Data
public class AuthenticationResponseDto {
    private String username;
    private String token;
}
