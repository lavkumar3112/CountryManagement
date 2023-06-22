package com.example.ElectricityPaymentApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Bill {
  @Id
  private String billId;
  private String userId;
  private String propertyId;
  private Date date;
  private double amount;
  private String status;
  // Constructor, getters, and setters
}
