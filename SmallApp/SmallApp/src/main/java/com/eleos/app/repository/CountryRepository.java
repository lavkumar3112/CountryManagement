package com.eleos.app.repository;

import com.eleos.app.db.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
  // Custom queries if needed
}
