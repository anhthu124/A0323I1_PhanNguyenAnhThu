package baiMau.Repository.impl;

import baiMau.Repository.IThuongRepository;
import baiMau.model.BenhNhan;
import baiMau.model.BenhNhanThuong;
import casestudy.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class BenhNhanThuongRepository implements IThuongRepository {
    private final String PATH_BENH_AN = "D:\\Skill\\codegym\\model\\modul2\\modul2\\src\\baiMau\\data\\danhSachBenhAn.csv";
    @Override
    public List<BenhNhanThuong> getList() {
        List<BenhNhanThuong> benhNhanArrayList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFromFile(PATH_BENH_AN);
        for (String string : stringList) {
            String[] array = string.split(",");
            BenhNhanThuong benhNhanThuong = new BenhNhanThuong();
            benhNhanArrayList.add(benhNhanThuong);
        }
        return benhNhanArrayList;
    }

    @Override
    public void add(BenhNhanThuong benhNhanThuong) {
List<String> stringList=new ArrayList<> ();
        stringList.add(BenhNhan.getInfoToWrite());
        ReadAndWrite.writeToFile(PATH_BENH_AN, stringList, true);
    }
}
