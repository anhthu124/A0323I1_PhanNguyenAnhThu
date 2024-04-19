package com.example.customerprovincemanagement.repository;

import com.example.customerprovincemanagement.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
}