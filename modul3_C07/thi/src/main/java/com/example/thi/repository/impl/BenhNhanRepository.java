package com.example.thi.repository.impl;

import com.example.thi.dto.BenhNhanDto;
import com.example.thi.model.BenhNhan;
import com.example.thi.repository.BaseRepository;
import com.example.thi.repository.IBenhNhanRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BenhNhanRepository implements IBenhNhanRepository {
    private static final String SHOW_LIST = "SELECT * FROM thi_m3;";
    private static final String CREATE_BENH_NHAN = "SELECT * FROM thi_m3.benh_nhan;";
    @Override
    public List<BenhNhanDto> showList() {
        List<BenhNhanDto>list=new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SHOW_LIST);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
               int id=resultSet.getInt("id");
               String maBenhAn=resultSet.getString("ma_benh_an");
               String maBenhNhan=resultSet.getString("ma_benh_nhan");
               String tenBenhNhan=resultSet.getString("ten_benh_nhan");
                Date ngayNhapVien=resultSet.getDate("ngay_nhap_vien");
                Date ngayRaVien=resultSet.getDate("ngay_ra_vien");
                String liDoNhapVien=resultSet.getString("li_do_nhap_vien");
                list.add((new BenhNhanDto(id,maBenhAn,maBenhNhan,tenBenhNhan,ngayNhapVien,ngayRaVien,liDoNhapVien)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public void createBenhNhan(BenhNhan benhNhan) {
        Connection connection = BaseRepository.getConnection();
//
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_BENH_NHAN);
//            preparedStatement.setInt(1,benhNhan.getId());
//            preparedStatement.setInt(2,);
//            preparedStatement.setString(2, benhNhan.getMaBenhNhan());
//            preparedStatement.setString(3, benhNhan.getTenBenhNhan());
//            preparedStatement.setDate(4, benhNhan.getNgayNhapVien());
//            preparedStatement.setDate(5, benhNhan.getNgayRaVien());
//            preparedStatement.setString(6, benhNhan.getLiDoNhapVien());
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }

}
