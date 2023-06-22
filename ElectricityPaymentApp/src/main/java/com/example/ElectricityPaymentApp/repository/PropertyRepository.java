package com.example.ElectricityPaymentApp.repository;

import com.example.ElectricityPaymentApp.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, String> {
  // Custom queries if needed
}
