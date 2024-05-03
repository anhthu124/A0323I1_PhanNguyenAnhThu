package com.example.demo.service;


import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository iStudentRepository;
    @Override
    public List<Student> showList() {
        return iStudentRepository.findAll();
    }

    @Override
    public void add(Student student) {
        iStudentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        iStudentRepository.deleteById(id);
    }

    @Override
    public Optional<Student> findById(Long id) {
        return iStudentRepository.findById(id);
    }

    @Override
    public void update(Student student) {
        iStudentRepository.save(student);
    }

    @Override
    public Page<Student> showList(Pageable pageable) {
        return iStudentRepository.findAll(pageable);
    }

    @Override
    public Page<Student> findCustomerByNameContaining(String name, Pageable pageable) {
        return iStudentRepository.findCustomerByNameContaining(name, pageable);
    }
}
