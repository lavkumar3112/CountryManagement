package com.example.ElectricityPaymentApp.repository;

import com.example.ElectricityPaymentApp.entity.SupportTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportTicketRepository extends JpaRepository<SupportTicket, String> {
  // Custom queries if needed
}
