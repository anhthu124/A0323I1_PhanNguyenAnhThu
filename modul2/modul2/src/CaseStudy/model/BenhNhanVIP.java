package casestudy.model;

import java.util.Date;

public class BenhNhanVIP extends BenhNhan {
    private String loaiVIP;
    private String thoiHanVIP;



    public BenhNhanVIP(int stt, int maBenhAn, String tenBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien) {
        super(stt, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
    }

    public BenhNhanVIP() {

    }


    public void benhNhanVIP(String loaiVIP, String thoiHanVIP) {
        this.loaiVIP = loaiVIP;
        this.thoiHanVIP = thoiHanVIP;
    }

    public String getLoaiVIP() {
        return loaiVIP;
    }

    public void setLoaiVIP(String loaiVIP) {
        this.loaiVIP = loaiVIP;
    }

    public String getThoiHanVIP() {
        return thoiHanVIP;
    }

    public void setThoiHanVIP(String thoiHanVIP) {
        this.thoiHanVIP = thoiHanVIP;
    }

    @Override
    public String toString() {
        return "benhNhanVIP{" +
                "loaiVIP='" + loaiVIP + '\'' +
                ", thoiHanVIP='" + thoiHanVIP + '\'' +
                '}';
    }
}