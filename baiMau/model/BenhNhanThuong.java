package baiMau.model;

public class BenhNhanThuong extends BenhNhan {
    private int phiNamVien;

    public BenhNhanThuong(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhNhanThuong() {

    }

    public int getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" +
                "phiNamVien=" + phiNamVien +
                '}';
    }

}
