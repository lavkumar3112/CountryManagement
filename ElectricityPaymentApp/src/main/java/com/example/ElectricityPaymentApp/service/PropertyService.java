package com.example.ElectricityPaymentApp.service;

import com.example.ElectricityPaymentApp.repository.PropertyRepository;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {
  private final PropertyRepository propertyRepository;

  public PropertyService(PropertyRepository propertyRepository) {
    this.propertyRepository = propertyRepository;
  }

  // Implement methods for property-related operations
}
