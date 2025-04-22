package com.example.mtb.entity;

import com.example.mtb.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.id.factory.spi.GeneratorDefinitionResolver;

import java.time.LocalDate;

@Entity
@Table(name = "user_details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String username;
    @Column(unique=true)
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private long createdAt;
    private long updatedAt;



}
