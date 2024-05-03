package com.example.demo.repository;


import com.example.demo.model.CodeGymClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICodeGymClassRepository extends JpaRepository<CodeGymClass,Long> {
}
