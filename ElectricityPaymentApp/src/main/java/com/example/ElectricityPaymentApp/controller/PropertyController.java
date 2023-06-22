package com.example.ElectricityPaymentApp.controller;

import com.example.ElectricityPaymentApp.service.PropertyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
public class PropertyController {
  private final PropertyService propertyService;

  public PropertyController(PropertyService propertyService) {
    this.propertyService = propertyService;
  }

  // Implement property-related endpoints
}
