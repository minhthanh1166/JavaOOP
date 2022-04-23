package BaiTapPhanLop;

import java.util.Scanner;

public class NhanVien {
    private String ten;
    private int tuoi;
    private String diaChi;
    private int luong;
    private int soGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, int luong, int soGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.luong = luong;
        this.soGioLam = soGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public void thongTinNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên: ");
        this.ten = sc.nextLine();
        System.out.print("Tuổi: ");
        this.tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Địa chỉ: ");
        this.diaChi = sc.nextLine();
        System.out.print("Tiền lương: ");
        this.luong = sc.nextInt();
        System.out.print("Số giờ làm việc: ");
        this.soGioLam = sc.nextInt();
    }

    public int tinhThuong() {
        if (soGioLam >= 200)
            return (luong * 2);
        else if (soGioLam >= 100)
            return (int) (luong * 0.1);
        else
            return 0;
    }

    public void display() {
        System.out.println("Họ tên: " + ten +
                " | Tuổi: " + tuoi +
                " | Địa chỉ: " + diaChi +
                " | Tiền lương: " + luong +
                " | Số giờ làm việc: " + soGioLam);
    }

}
