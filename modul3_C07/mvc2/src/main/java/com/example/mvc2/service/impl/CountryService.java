package com.example.mvc2.service.impl;

import com.example.mvc2.model.Country;
import com.example.mvc2.repository.ICountryRepo;
import com.example.mvc2.repository.iplm.CountryRepo;
import com.example.mvc2.service.ICountryService;

import java.sql.SQLException;
import java.util.List;

public class CountryService implements ICountryService {
    ICountryRepo countryRepo = new CountryRepo();
    @Override
    public List<Country> getListCountry() {
        return countryRepo.getListCountry();
    }

    @Override
    public boolean add(Country country) {
        try {
            return countryRepo.add(country);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
