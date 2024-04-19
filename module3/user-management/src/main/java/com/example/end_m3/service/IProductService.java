package com.example.end_m3.service;

import com.example.end_m3.model.Product;


import java.util.List;

public interface IProductService {
    List<Product> showList();
    void addNewProduct(Product product);
//    void deleteProduct(int id);


}
