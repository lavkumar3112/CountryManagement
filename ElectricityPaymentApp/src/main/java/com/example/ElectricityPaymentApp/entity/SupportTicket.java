package com.example.ElectricityPaymentApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SupportTicket {
  @Id
  private String ticketId;
  private String userId;
  private String category;
  private String description;
  private String status;
  private String assignedStaffId;
  // Constructor, getters, and setters
}
