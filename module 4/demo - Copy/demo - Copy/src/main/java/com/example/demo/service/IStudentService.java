package com.example.demo.service;


import com.example.demo.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> showList();
    void add(Student student);
    void delete(Long id);
    Optional<Student> findById(Long id);
    void  update(Student student);
    Page<Student> showList(Pageable pageable);
    Page<Student> findCustomerByNameContaining(String name,Pageable pageable);
}
