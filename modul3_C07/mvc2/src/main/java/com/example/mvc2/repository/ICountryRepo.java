package com.example.mvc2.repository;

import com.example.mvc2.model.Country;

import java.sql.SQLException;
import java.util.List;

public interface ICountryRepo {
    List<Country> getListCountry();
    boolean add(Country country) throws SQLException;
}


