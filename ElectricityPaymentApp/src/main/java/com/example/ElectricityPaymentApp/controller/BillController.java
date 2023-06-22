package com.example.ElectricityPaymentApp.controller;

import com.example.ElectricityPaymentApp.service.BillService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bills")
public class BillController {
  private final BillService billService;

  public BillController(BillService billService) {
    this.billService = billService;
  }

  // Implement bill-related endpoints
}
