package com.example.mtb.mapping;

import com.example.mtb.dto.UserRegistrationDTO;
import com.example.mtb.dto.UserResponseDTO;
import com.example.mtb.entity.TheaterOwner;
import com.example.mtb.entity.User;
import com.example.mtb.entity.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationMapping {

    public User registrationUser(UserRegistrationDTO userRegistrationDTO){
        User user =new User();
        user.setUsername(userRegistrationDTO.username());
        user.setEmail(userRegistrationDTO.email());
        user.setPassword(userRegistrationDTO.password());
        user.setRole(userRegistrationDTO.role());
        user.setPhoneNumber(userRegistrationDTO.phoneNumber());
        user.setDateOfBirth(userRegistrationDTO.dateOfBirth());
        return user;
    }
    public TheaterOwner registrationTheaterOwner(UserRegistrationDTO userRegistrationDTO){
        TheaterOwner theaterOwner=new TheaterOwner();
        theaterOwner.setUsername(userRegistrationDTO.username());
        theaterOwner.setEmail(userRegistrationDTO.email());
        theaterOwner.setPassword(userRegistrationDTO.password());
        theaterOwner.setRole(userRegistrationDTO.role());
        theaterOwner.setPhoneNumber(userRegistrationDTO.phoneNumber());
        theaterOwner.setDateOfBirth(userRegistrationDTO.dateOfBirth());
        return theaterOwner;
    }
    public UserResponseDTO userResponseDTO(UserDetails userDetails){
        return new UserResponseDTO(userDetails.getUserId(), userDetails.getUsername(), userDetails.getEmail(), userDetails.getPhoneNumber(),
                userDetails.getDateOfBirth());
    }
}
