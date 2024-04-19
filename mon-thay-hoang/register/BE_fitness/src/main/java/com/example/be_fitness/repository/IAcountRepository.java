package com.example.be_fitness.repository;

import com.example.be_fitness.model.Acount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAcountRepository extends JpaRepository<Acount,Long> {
    boolean existsByEmail(String email);


}
