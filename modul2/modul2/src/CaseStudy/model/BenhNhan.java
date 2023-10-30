package casestudy.model;

import java.util.Date;

public  class BenhNhan {
    private int stt;
    private int maBenhAn;
    private String tenBenhNhan;
    private Date ngayNhapVien;
    private Date ngayRaVien;
    protected String lyDoNhapVien;

    public BenhNhan(int i, String s, String s1) {
    }

    public BenhNhan(int stt, int maBenhAn, String tenBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien) {
        this.stt = stt;
        this.maBenhAn = maBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public BenhNhan() {

    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(int maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public Date getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(Date ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public Date getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(Date ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    @Override
    public String toString() {
        return "BenhNhan{" +
                "stt=" + stt +
                ", maBenhAn=" + maBenhAn +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapVien=" + ngayNhapVien +
                ", ngayRaVien=" + ngayRaVien +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                '}';
    }
    public String getInfoToCSV(){
        return stt +","+maBenhAn+","+ tenBenhNhan +","+ ngayNhapVien +","+ngayRaVien +","+lyDoNhapVien;
    }
}