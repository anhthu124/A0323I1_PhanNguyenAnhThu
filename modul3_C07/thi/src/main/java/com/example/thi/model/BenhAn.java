package com.example.thi.model;

public class BenhAn {
private int idBenhAn;
private String tenBenhAn;

    public BenhAn() {
    }

    public BenhAn(int idBenhAn, String tenBenhAn) {
        this.idBenhAn = idBenhAn;
        this.tenBenhAn = tenBenhAn;
    }

    public int getIdBenhAn() {
        return idBenhAn;
    }

    public void setIdBenhAn(int idBenhAn) {
        this.idBenhAn = idBenhAn;
    }

    public String getTenBenhAn() {
        return tenBenhAn;
    }

    public void setTenBenhAn(String tenBenhAn) {
        this.tenBenhAn = tenBenhAn;
    }
}
