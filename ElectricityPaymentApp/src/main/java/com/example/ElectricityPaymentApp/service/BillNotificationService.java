package com.example.ElectricityPaymentApp.service;

import com.example.ElectricityPaymentApp.repository.BillRepository;
import org.springframework.stereotype.Service;

@Service
public class BillNotificationService {
  private final BillRepository billRepository;
  private final NotificationService notificationService;

  public BillNotificationService(BillRepository billRepository, NotificationService notificationService) {
    this.billRepository = billRepository;
    this.notificationService = notificationService;
  }

  // Implement methods for bill reminders and notifications
}
