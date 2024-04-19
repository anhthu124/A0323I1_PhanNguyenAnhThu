package com.example.mvc2.service;

import com.example.mvc2.DTO.ProductDTO;
import com.example.mvc2.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    List<ProductDTO> getAll();
    boolean add(Product product);
    boolean delete(int id);
    boolean updateProduct(Product product) throws SQLException;
    Product getProductByID(int id) throws SQLException;
    List<ProductDTO> getProductByName(String inputName) throws SQLException;

}
