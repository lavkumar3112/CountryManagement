package com.example.ElectricityPaymentApp.controller;

import com.example.ElectricityPaymentApp.service.SupportTicketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/support-tickets")
public class SupportTicketController {
  private final SupportTicketService supportTicketService;

  public SupportTicketController(SupportTicketService supportTicketService) {
    this.supportTicketService = supportTicketService;
  }

  // Implement support ticket-related endpoints
}
