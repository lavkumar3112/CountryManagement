package com.example.ElectricityPaymentApp.repository;

import com.example.ElectricityPaymentApp.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, String> {
  // Custom queries if needed
}
