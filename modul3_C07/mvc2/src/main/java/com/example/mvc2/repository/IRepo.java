package com.example.mvc2.repository;

import com.example.mvc2.DTO.ProductDTO;
import com.example.mvc2.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IRepo {
    List<ProductDTO> getAll();
    boolean add(Product product) throws SQLException;
    boolean delete(int id);
    boolean update(Product product) throws SQLException;
    Product getProductByID(int id) throws SQLException;
    List<ProductDTO> getProductByName(String inputName) throws SQLException;

}
