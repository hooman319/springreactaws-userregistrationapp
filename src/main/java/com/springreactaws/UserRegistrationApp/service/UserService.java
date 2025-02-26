package com.springreactaws.UserRegistrationApp.service;

import com.springreactaws.UserRegistrationApp.model.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserDTO> getAllUsers();

    void saveUser(UserDTO userDTO);

    UserDTO getUserInformation(Long userId);

    void deleteUser(Long userId);
}
