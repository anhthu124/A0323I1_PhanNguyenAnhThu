package com.example.mvc2.service;

import com.example.mvc2.model.Country;

import java.util.List;

public interface ICountryService {
    List<Country> getListCountry();
    boolean add(Country country);
}
