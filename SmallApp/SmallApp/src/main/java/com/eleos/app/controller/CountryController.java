package com.eleos.app.controller;

import com.eleos.app.db.Country;
import com.eleos.app.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/countries")
public class CountryController {
  @Autowired
  private CountryService countryService;

  @PostMapping
  public Country createCountry(@RequestBody Map<String, String> request) {
    return countryService.createCountry(request.get("name"));
  }

  @GetMapping
  public Page<Country> listAllCountries(@RequestParam(defaultValue = "0") int page) {
    return countryService.listAllCountries(page);
  }

  @GetMapping("/{id}")
  public Country getCountryById(@PathVariable Long id) {
    return countryService.getCountryById(id);
  }

  @PutMapping("/{id}")
  public Country updateCountry(@PathVariable Long id, @RequestBody Map<String, String> request) {
    return countryService.updateCountry(id, request.get("name"));
  }

  @DeleteMapping("/{id}")
  public void deleteCountry(@PathVariable Long id) {
    countryService.deleteCountry(id);
  }
}
