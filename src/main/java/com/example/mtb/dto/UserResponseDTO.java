package com.example.mtb.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public record UserResponseDTO(

        String userId,

        String username,

        String email,
        String role,

        LocalDate dateOfBirth


) {
}
