package com.example.mtb.dto;

import com.example.mtb.enums.Role;

import java.time.LocalDate;

public record UserRegistrationDTO(
        String username,
        String email,
        String password,
        Role role,
        String phoneNumber,
        LocalDate dateOfBirth

) {
}
