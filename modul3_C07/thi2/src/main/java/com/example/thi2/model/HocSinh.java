package com.example.thi2.model;

public class HocSinh {
    private int maHS;
    private String hoTen;
    private String lop;

    public HocSinh() {

    }

    public HocSinh(int maHS, String hoTen, String lop) {
        this.maHS = maHS;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
