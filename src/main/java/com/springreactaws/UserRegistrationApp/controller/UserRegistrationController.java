package com.springreactaws.UserRegistrationApp.controller;

import com.springreactaws.UserRegistrationApp.model.UserDTO;
import com.springreactaws.UserRegistrationApp.service.UserService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apis/users")
@RequiredArgsConstructor
public class UserRegistrationController {

    private final UserService userService;

    @ApiOperation(value = "Retrieve All Registered User")
    //Accept Header Versioning for Rest API Best Practice + need a configuration class
    @GetMapping//(produces = "application/vnd.hooman.userregisteration-v1+json")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }


}
