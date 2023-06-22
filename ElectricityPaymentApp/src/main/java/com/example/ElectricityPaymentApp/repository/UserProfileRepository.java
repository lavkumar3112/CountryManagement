package com.example.ElectricityPaymentApp.repository;

import com.example.ElectricityPaymentApp.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, String> {
  // Custom queries if needed
}
