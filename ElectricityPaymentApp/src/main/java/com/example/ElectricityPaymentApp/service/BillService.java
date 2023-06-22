package com.example.ElectricityPaymentApp.service;

import com.example.ElectricityPaymentApp.repository.BillRepository;
import org.springframework.stereotype.Service;

@Service
public class BillService {
  private final BillRepository billRepository;

  public BillService(BillRepository billRepository) {
    this.billRepository = billRepository;
  }

  // Implement methods for bill-related operations
}
