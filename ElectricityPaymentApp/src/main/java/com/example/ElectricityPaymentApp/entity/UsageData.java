package com.example.ElectricityPaymentApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class UsageData {
  @Id
  private String usageId;
  private String userId;
  private String propertyId;
  private Date date;
  private float unitUsage;
  // Constructor, getters, and setters
}
