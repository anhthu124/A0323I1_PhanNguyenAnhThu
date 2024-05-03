package com.example.springcustomermanagementrestful.repository;

import com.example.springcustomermanagementrestful.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Optional<Customer> findById(Long id);

    Customer save(Customer customer);

    void deleteById(Long id);

    Iterable<Customer> findAll();
}