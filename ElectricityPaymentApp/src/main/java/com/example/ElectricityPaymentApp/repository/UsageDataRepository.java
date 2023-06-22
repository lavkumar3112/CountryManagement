package com.example.ElectricityPaymentApp.repository;

import com.example.ElectricityPaymentApp.entity.UsageData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsageDataRepository extends JpaRepository<UsageData, String> {
  // Custom queries if needed
}
