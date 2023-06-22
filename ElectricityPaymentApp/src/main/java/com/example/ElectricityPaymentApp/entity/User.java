package com.example.ElectricityPaymentApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
  @Id
  private String userId;
  private String email;
  private String password;
  private String role;
  // Constructor, getters, and setters
}
