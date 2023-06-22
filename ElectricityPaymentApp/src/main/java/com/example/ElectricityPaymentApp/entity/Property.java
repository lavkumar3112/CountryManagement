package com.example.ElectricityPaymentApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Property {
  @Id
  private String propertyId;
  private String userId;
  private String address;
  private String meterNumber;
  private String tariffPlan;
  // Constructor, getters, and setters
}
