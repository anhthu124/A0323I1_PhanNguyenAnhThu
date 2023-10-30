package casestudy.repository;

import casestudy.model.*;
import ss8_mvc.model.Student;
import ss8_mvc.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class BenhNhanRepository implements IBenhNhanRepository {
    private static String PATH_BENH_AN = "D:\\Skill\\codegym\\model\\modul2\\modul2\\src\\casestudy\\data\\NganHang.csv";


    @Override
    public void deleteBenhNhaByMa(int maBenhAn) {
List<BenhNhan>benhNhanList=getListBenhNhan();
    }

    @Override
    public List<BenhNhan> getListBenhNhan() {
        List<BenhNhan> benhNhanList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_BENH_AN);
        String[] array = null;
        for (String string: stringList) {
            array = string.split(",");
            BenhNhan benhNhan=new BenhNhan(Integer.parseInt(array[0]),array[1],array[2]);
            benhNhanList.add(benhNhan);
        }
        return benhNhanList;
    }

}