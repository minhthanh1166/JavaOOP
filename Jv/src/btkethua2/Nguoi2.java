package btkethua2;

import java.util.Scanner;

public class Nguoi2 {
    protected String ten;
    protected String gioiTinh;
    protected String ngaySinh;
    protected String queQuan;
    protected String diaChi;

    public Nguoi2() {
    }

    public Nguoi2(String ten, String gioiTinh, String ngaySinh, String queQuan, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
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
        this.ten = sc.nextLine();
        System.out.print("Giới tính: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("Ngày sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.print("Quê quán: ");
        this.queQuan = sc.nextLine();
        System.out.print("Địa chỉ: " );
        this.diaChi = sc.nextLine();
    }

    public void outPut(){
        System.out.println("Họ và tên: "+this.ten+
                " | Giới tính: "+ this.gioiTinh+
                " | Ngày sinh: "+ this.ngaySinh+
                " | Quê quán: "+this.queQuan+
                " | Địa chỉ: "+this.diaChi);
    }
}
