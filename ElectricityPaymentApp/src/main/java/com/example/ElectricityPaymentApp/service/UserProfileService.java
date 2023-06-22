package com.example.ElectricityPaymentApp.service;

import com.example.ElectricityPaymentApp.repository.UserProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {
  private final UserProfileRepository userProfileRepository;

  public UserProfileService(UserProfileRepository userProfileRepository) {
    this.userProfileRepository = userProfileRepository;
  }

  // Implement methods for user profile-related operations
}
