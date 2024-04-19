package com.example.customerprovincemanagement.service;

import com.example.customerprovincemanagement.model.Customer;
import com.example.customerprovincemanagement.model.Province;

import java.util.Optional;

public interface ICustomerService
{
    void save(Customer customer);

    Optional<Customer> findById(Long id);

    void remove(Long id);

    Iterable<Customer> findAll();

    Iterable<Customer> findAllByProvince(Province province);
}
