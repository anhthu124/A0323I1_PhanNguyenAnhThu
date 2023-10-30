package baiMau.Repository;

import baiMau.model.BenhNhanThuong;

import java.util.List;

public interface IThuongRepository extends IRepository<BenhNhanThuong> {

    @Override
    void add(BenhNhanThuong benhNhanThuong);
}
