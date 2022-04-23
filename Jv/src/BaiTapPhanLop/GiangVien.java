package BaiTapPhanLop;

import java.util.Scanner;

public class GiangVien {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String khoa;
    private String trinhDo;
    private float phuCap;
    private int soTietDay;
    private float heSoLuong;

    public GiangVien() {
    }

    public GiangVien(String hoTen, String ngaySinh, String gioiTinh, String khoa, String trinhDo, float phuCap, int soTietDay, float heSoLuong) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
        this.trinhDo = trinhDo;
        this.phuCap = phuCap;
        this.soTietDay = soTietDay;
        this.heSoLuong = heSoLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public float getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(float phuCap) {
        this.phuCap = phuCap;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    // nhập thông tin giảng viên


    // tính lương
    public int luong() {
        return (int) (heSoLuong * 1400000 + phuCap + soTietDay * 45000);
    }
}
