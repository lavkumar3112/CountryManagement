package com.example.ElectricityPaymentApp.service;

import com.example.ElectricityPaymentApp.repository.UsageDataRepository;
import org.springframework.stereotype.Service;

@Service
public class UsageDataService {
  private final UsageDataRepository usageDataRepository;

  public UsageDataService(UsageDataRepository usageDataRepository) {
    this.usageDataRepository = usageDataRepository;
  }

  // Implement methods for usage data-related operations
}
