package com.example.end_m3.repository;

import com.example.end_m3.model.Product;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String FIND_ALL = "SELECT * FROM end_m3.product";
    private static final String ADD_NEW_PRODUCT ="INSERT INTO product (name,price,quantity,color,description,category)"  + "VALUES (?,?,?,?,?,?)";
    private static final String DELETE_PRODUCTS_SQL = "delete from product where id = ?";

    @Override
    public List<Product> showList() {
        List<Product> list = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(FIND_ALL);
            while (resultSet.next()){
                int code = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                String category = resultSet.getString("categogy");
                list.add(new Product(code,name,price,quantity,color,description,category));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void addNewProduct(Product product) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_NEW_PRODUCT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantily());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescription());
            preparedStatement.setString(6, product.getCategogy());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
//    @Override
//    public boolean deleteProduct(int id) {
//        boolean rowDelete = false;
//        Connection connection = BaseRepository.getConnection();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCTS_SQL);
//            preparedStatement.setInt(1,id);
//            rowDelete = preparedStatement.executeUpdate() > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return rowDelete;
//    }

}
