package com.github.paulatamires.citiesapi2.countries.repository;

import com.github.paulatamires.citiesapi2.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {
}
