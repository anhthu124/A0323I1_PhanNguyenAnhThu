package com.example.phone2.service.Impl;

import com.example.phone2.model.Category;
import com.example.phone2.repository.ICategoryRepo;
import com.example.phone2.repository.impl.CategoryRepo;
import com.example.phone2.service.ICategoryService;


import java.util.List;

public class CategoryService implements ICategoryService {
    ICategoryRepo repo = new CategoryRepo();
    @Override
    public List<Category> showList() {
        return repo.showList();
    }
}
