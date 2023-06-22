package com.example.ElectricityPaymentApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserProfile {
  @Id
  private String profileId;
  private String userId;
  private String name;
  private String contact;
  private String address;
  // Constructor, getters, and setters
}
