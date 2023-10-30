package casestudy.repository;

import casestudy.model.BenhNhan;
import casestudy.utils.ReadAndWrite;
import ss8_mvc.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface IBenhNhanRepository {
    static void add(BenhNhan benhNhan) {
        List<String> stringList=new ArrayList<>();
        stringList.add(benhNhan.getInfoToCSV());
       // ReadAndWrite.writeToFile(BenhNhanRepository.PATH_BENH_AN,stringList,true);
    }
    void deleteBenhNhaByMa(int maBenhAn);
    List<BenhNhan> getListBenhNhan();
    public static Map<BenhNhan, Integer> getList() {
        return null;

    }
}
