package btkethua3;

import java.util.Scanner;

public class May {
    protected String tenNSX;
    protected String diaChi;
    protected String nhanHieu;
    protected int giaThanh;

    public May() {
    }

    public May(String tenNSX, String diaChi, String nhanHieu, int giaThanh) {
        this.tenNSX = tenNSX;
        this.diaChi = diaChi;
        this.nhanHieu = nhanHieu;
        this.giaThanh = giaThanh;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public int getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(int giaThanh) {
        this.giaThanh = giaThanh;
    }

    public void nhapThongTinMay() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Tên nhà sản xuất: ");
        this.tenNSX = nhap.nextLine();
        System.out.print("Địa chỉ: ");
        this.diaChi = nhap.nextLine();
        System.out.print("Nhãn hiệu: ");
        this.nhanHieu = nhap.nextLine();
        System.out.print("Giá thành: ");
        this.giaThanh = nhap.nextInt();
    }

    public void display() {
        System.out.println("Tên nhà sản xuất: " + this.tenNSX +
                " | Địa chỉ: " + this.diaChi +
                " | Nhãn hiệu: " + this.nhanHieu +
                " | Giá thành: " + this.giaThanh);
    }

}
