package com.example.end_m3.repository;

import com.example.end_m3.model.Product;
import java.util.List;

public interface IProductRepository {
    List<Product> showList();

    void addNewProduct(Product product);
//    Product selectProduct(int id);
//    boolean deleteProduct(int id);

}
