package com.example.end_m3.service;

import com.example.end_m3.model.Product;

import com.example.end_m3.repository.IProductRepository;
import com.example.end_m3.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> showList() {
        return productRepository.showList();
    }

    @Override
    public void addNewProduct(Product product) {
        productRepository.addNewProduct(product);

    }

//    @Override
//    public void deleteProduct(int id) {
//
//        productRepository.deleteProduct(id);
//    }


}
