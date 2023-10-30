package casestudy.model;

import java.util.Date;

public class BenhNhanThuong extends BenhNhan {
    private int numberOfFloor;
    private String roomStandard;
    String[] array = null;


    private int phiNamVien;

    public BenhNhanThuong(int stt, int maBenhAn, String tenBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien) {
        super(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
    }

    public BenhNhanThuong() {
        super();
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
