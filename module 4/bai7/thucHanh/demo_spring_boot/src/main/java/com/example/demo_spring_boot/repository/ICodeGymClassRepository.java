package com.example.demo_spring_boot.repository;


import com.example.demo_spring_boot.model.CodeGymClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICodeGymClassRepository extends JpaRepository<CodeGymClass,Long> {
}
