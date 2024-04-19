package com.example.thi.repository.impl;

import com.example.thi.model.BenhAn;
import com.example.thi.repository.BaseRepository;
import com.example.thi.repository.IBenhAnRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhAnRepository implements IBenhAnRepository {
    private static final String SHOW="SELECT * FROM thi_m3.benh_an;";
    @Override
    public List<BenhAn> showList() {
        List<BenhAn>list= new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SHOW);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id =   resultSet.getInt("id_ma_benh_an");
                String tenBenhAn =  resultSet.getString("ten_benh_an");
                list.add(new BenhAn(id,tenBenhAn));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
