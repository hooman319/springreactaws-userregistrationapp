package com.springreactaws.UserRegistrationApp.service;

import com.springreactaws.UserRegistrationApp.dao.UserRegisterationRepository;
import com.springreactaws.UserRegistrationApp.model.UserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRegisterationRepository userRegisterationRepository;

    public List<UserDTO> getAllUsers() {
        return userRegisterationRepository.findAll();
    }

    public void saveUser(UserDTO userDTO) {
        UserDTO savedUser = userRegisterationRepository.save(userDTO);
        //get user id is saved
        Long userId = savedUser.getId();
        log.info(String.format("the user is saved with Id=%d", userId));
    }

    public UserDTO getUserInformation(Long userId) {
        Optional<UserDTO> optionalUserDTO = userRegisterationRepository.findById(userId);
        if(optionalUserDTO.isPresent())
            return optionalUserDTO.get();
        else
            return optionalUserDTO.orElse(new UserDTO());
    }

    public void deleteUser(Long userId){
        userRegisterationRepository.deleteById(userId);
    }
}
