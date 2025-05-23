package com.example.mtb.controller;

import com.example.mtb.dto.UserRegistrationDTO;
import com.example.mtb.dto.UserResponseDTO;
import com.example.mtb.entity.UserDetails;
import com.example.mtb.mapping.UserRegistrationMapping;
import com.example.mtb.service.UserService;
import com.example.mtb.utility.ResponseStructure;
import com.example.mtb.utility.StructureResponseBuilder;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
//@RequestMapping("/")
public class UserController {
    private final UserService userService;
    private final StructureResponseBuilder structureResponseBuilder;
    private final UserRegistrationMapping userRegistrationMapping;

    @PostMapping("/register")
    public ResponseEntity<ResponseStructure<UserResponseDTO>> registerUser(@Valid @RequestBody UserRegistrationDTO userRegistrationDTO){
        return structureResponseBuilder.success(HttpStatus.CREATED,"user registration successfully done",userRegistrationMapping.userResponseDTO(userService.userRegister(userRegistrationDTO)));
    }


}
