package com.example.phones.service.imple;


import com.example.phones.model.Category;
import com.example.phones.repository.ICategoryRepo;
import com.example.phones.repository.impl.CategoryRepo;
import com.example.phones.service.ICategoryService;

import java.util.List;

public class CategoryService implements ICategoryService {
    ICategoryRepo repo = new CategoryRepo();
    @Override
    public List<Category> showList() {
        return repo.showList();
    }
}
