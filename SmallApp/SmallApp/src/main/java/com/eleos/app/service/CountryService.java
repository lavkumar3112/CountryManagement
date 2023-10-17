package com.eleos.app.service;
import com.eleos.app.db.Country;
import com.eleos.app.exception.ResourceNotFoundException;
import com.eleos.app.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
  @Autowired
  private CountryRepository countryRepository;

  public Country createCountry(String name) {
    Country country = new Country();
    country.setName(name);
    return countryRepository.save(country);
  }

  public Page<Country> listAllCountries(int page) {
    Pageable pageable = PageRequest.of(page, 5, Sort.by("name"));
    return countryRepository.findAll(pageable);
  }

  public Country getCountryById(Long id) {
    return countryRepository.findById(id)
      .orElseThrow(() -> new ResourceNotFoundException("Country not found with id " + id));
  }

  public Country updateCountry(Long id, String newName) {
    Country country = getCountryById(id);
    country.setName(newName);
    return countryRepository.save(country);
  }

  public void deleteCountry(Long id) {
    Country country = getCountryById(id);
    countryRepository.delete(country);
  }
}
