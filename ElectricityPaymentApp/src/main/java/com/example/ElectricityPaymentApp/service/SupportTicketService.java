package com.example.ElectricityPaymentApp.service;

import com.example.ElectricityPaymentApp.repository.SupportTicketRepository;
import org.springframework.stereotype.Service;

@Service
public class SupportTicketService {
  private final SupportTicketRepository supportTicketRepository;
  private final UserService userService;

  public SupportTicketService(SupportTicketRepository supportTicketRepository, UserService userService) {
    this.supportTicketRepository = supportTicketRepository;
    this.userService = userService;
  }

  // Implement methods for support ticket-related operations
}

