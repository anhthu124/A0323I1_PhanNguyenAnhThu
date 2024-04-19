package com.example.demo_spring_boot.service;


import com.example.demo_spring_boot.model.CodeGymClass;

import java.util.List;

public interface ICodeGymClassService {
    List<CodeGymClass> findAll();
}
