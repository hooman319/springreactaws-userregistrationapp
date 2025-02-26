package com.springreactaws.UserRegistrationApp.dao;

import com.springreactaws.UserRegistrationApp.model.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegisterationRepository extends JpaRepository<UserDTO,Long> {
}
