package com.example.mtb.service.impl;

import com.example.mtb.dto.UserRegistrationDTO;
import com.example.mtb.entity.TheaterOwner;
import com.example.mtb.entity.User;
import com.example.mtb.entity.UserDetails;
import com.example.mtb.enums.Role;
import com.example.mtb.exception.EmailAlreadyExistException;
import com.example.mtb.mapping.UserRegistrationMapping;
import com.example.mtb.repository.UserRepository;
import com.example.mtb.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserRegistrationMapping userRegistrationMapping;

    @Override
    public UserDetails userRegister(UserRegistrationDTO userRegistrationDTO) {

        if (userRepository.existsByEmail(userRegistrationDTO.email())) {
            throw new EmailAlreadyExistException("user mail already exist" + userRegistrationDTO.email());

        }
        if (userRegistrationDTO.role() == Role.USER) {
            return userRepository.save(userRegistrationMapping.registrationUser(userRegistrationDTO));
        } else {
            return userRepository.save(userRegistrationMapping.registrationTheaterOwner(userRegistrationDTO));
        }
    }
}
