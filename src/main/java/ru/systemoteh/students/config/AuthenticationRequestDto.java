package ru.systemoteh.students.config;

import lombok.Data;

@Data
public class AuthenticationRequestDto {
    private String username;
    private String password;
}
