package com.example.thi_ket_thuc_module3.repository;

import com.example.thi_ket_thuc_module3.Dto.TheMuonSachDto;
import com.example.thi_ket_thuc_module3.model.TheMuonSach;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TheMuonSachDtoRepository implements ITheMuonSachDtoRepository{
    private static final String SHOW_LIST = "SELECT * FROM quan_ly_sach.the_muon_sach tms \n" +
            "join sach s on tms.ma_sach = s.ma_sach \n" +
            "join hoc_sinh hs on hs.id_ma_hoc_sinh = tms.id_ma_hoc_sinh ;";

    @Override
    public List<TheMuonSachDto> showList() {
        List<TheMuonSachDto> list = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SHOW_LIST);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String maMuonSach = resultSet.getString("ma_muon_sach");
                boolean trangThai = resultSet.getBoolean("trang_thai");
                Date ngayMuon = resultSet.getDate("ngay_muon");
                Date ngayTra = resultSet.getDate("ngay_tra");
                String maSach = resultSet.getString("ma_sach");
                String tenSach = resultSet.getString("ten_sach");
                String tacGia = resultSet.getString("tac_gia");
                String moTa = resultSet.getString("mo_ta");
                int soLuong = resultSet.getInt("so_luong");
                int maHocSinh = resultSet.getInt("id_ma_hoc_sinh");
                String hoTen = resultSet.getString("ho_ten");
                String Lop = resultSet.getString("lop");
                list.add(new TheMuonSachDto(id,maMuonSach,trangThai,ngayMuon,ngayTra,maSach,tenSach,tacGia,moTa,soLuong,maHocSinh,hoTen,Lop));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

}
