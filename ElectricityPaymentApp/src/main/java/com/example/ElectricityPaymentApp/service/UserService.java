package com.example.ElectricityPaymentApp.service;

import com.example.ElectricityPaymentApp.entity.LoginDto;
import com.example.ElectricityPaymentApp.entity.User;
import com.example.ElectricityPaymentApp.repository.UserProfileRepository;
import com.example.ElectricityPaymentApp.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class UserService {
  private final UserRepository userRepository;


  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;

  }

  public void registerUser(User user) {
    // Implement user registration logic
  }

  public String loginUser(LoginDto loginDto) {
    // Implement user login logic
    return loginDto.toString();
  }

  // Other methods for user-related operations (e.g., update user details, change password, etc.)
}
