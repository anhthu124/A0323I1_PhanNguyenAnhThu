package com.example.phone.service.impl;

import com.example.phone.model.Category;
import com.example.phone.repository.ICategoryRepo;
import com.example.phone.repository.impl.CategoryRepo;
import com.example.phone.service.ICategoryService;

import java.util.List;

public class CategoryService implements ICategoryService {
    ICategoryRepo repo = new CategoryRepo();
    @Override
    public List<Category> showList() {
        return repo.showList();
    }
}
