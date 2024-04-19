package com.example.thi.repository;

import com.example.thi.dto.BenhNhanDto;
import com.example.thi.model.BenhNhan;

import java.util.List;

public interface IBenhNhanRepository {
    List<BenhNhanDto> showList();
   void createBenhNhan(BenhNhan benhNhan);
//    boolean updateProduct(Product product);
//    boolean deleteProduct(int id);
//    ProductDto selectProduct(int id);
//    List<ProductDto> searchProductByName(String name);
//    List<ProductDto> searchProductByMaMatHang(String maMatHang);

}
