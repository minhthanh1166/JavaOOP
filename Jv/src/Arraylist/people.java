package Arraylist;

import java.util.Scanner;

public class people implements peoples{
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;
    protected String diaChi;

    public people() {
    }

    public people(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inPut(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Ngày sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.print("Giới tính: ");
        this.gioiTinh = sc.nextLine();
        while(!(this.gioiTinh.equals("nam") || this.gioiTinh.equals("nữ"))){
            System.out.print("Giới tính là nam hoặc nữ: ");
            this.gioiTinh = sc.nextLine();
        }
        System.out.print("Địa chỉ: ");
        this.diaChi = sc.nextLine();
    }
    public void display(){
        System.out.println("Họ tên: " + this.hoTen +
                " | Ngày sinh: " + this.ngaySinh +
                " | Giới tính: " + this.gioiTinh +
                " | Địa chỉ: " + this.diaChi);
    }

    @Override
    public String toString() {
        return "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'';
    }
}
