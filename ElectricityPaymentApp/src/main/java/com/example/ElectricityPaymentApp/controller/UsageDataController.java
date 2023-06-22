package com.example.ElectricityPaymentApp.controller;

import com.example.ElectricityPaymentApp.service.UsageDataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usage-data")
public class UsageDataController {
  private final UsageDataService usageDataService;

  public UsageDataController(UsageDataService usageDataService) {
    this.usageDataService = usageDataService;
  }

  // Implement usage data-related endpoints
}
