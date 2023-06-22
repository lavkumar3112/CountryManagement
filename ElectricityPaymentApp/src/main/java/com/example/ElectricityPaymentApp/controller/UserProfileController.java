package com.example.ElectricityPaymentApp.controller;

import com.example.ElectricityPaymentApp.service.UserProfileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-profiles")
public class UserProfileController {
  private final UserProfileService userProfileService;

  public UserProfileController(UserProfileService userProfileService) {
    this.userProfileService = userProfileService;
  }

  // Implement user profile-related endpoints
}
