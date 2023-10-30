package baiMau.model;

public class benhNhanVIP extends BenhNhan {
    private String loaiVIP;
    private String thoiHanVIP;

    public benhNhanVIP(String loaiVIP, String thoiHanVIP) {
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
