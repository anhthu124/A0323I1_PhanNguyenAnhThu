package com.example.mvc2.service.impl;

import com.example.mvc2.DTO.ProductDTO;
import com.example.mvc2.model.Product;
import com.example.mvc2.repository.ICountryRepo;
import com.example.mvc2.repository.IRepo;
import com.example.mvc2.repository.iplm.ProductRepo;
import com.example.mvc2.service.ICountryService;
import com.example.mvc2.service.IProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {
    IRepo productRepo = new ProductRepo();
    @Override
    public List<ProductDTO> getAll() {
        return productRepo.getAll();
    }

    @Override
    public boolean add(Product product) {
        try {
            return productRepo.add(product);
        } catch (SQLException e) {
            return  false;
        }
    }

    @Override
    public boolean delete(int id) {
        return productRepo.delete(id);
    }

    @Override
    public boolean updateProduct(Product product) throws SQLException {
        return  productRepo.update(product);
    }

    @Override
    public Product getProductByID(int id) throws SQLException {
        return productRepo.getProductByID(id);
    }

    @Override
    public List<ProductDTO> getProductByName(String inputName) throws SQLException {
        return  productRepo.getProductByName(inputName);
    }
}
