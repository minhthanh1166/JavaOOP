package kiemtra;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String gioiTinh;
    protected String ngaySinh;

    public Nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    public Nguoi(String hoTen, String gioiTinh, String ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public void inPut(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Ngày sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.print("Giới tính: ");
        this.gioiTinh = sc.nextLine();
    }

    public void outPut(){
        System.out.println("Họ và tên: "+this.hoTen+
                " | Ngày sinh: "+this.ngaySinh+
                " | Giới tính: "+this.gioiTinh);
    }
}
