package Arraylist;

import java.util.Scanner;

public class employee extends people {
    private int tienLuong;
    private int soGioLamViec;
    private String phongBan;

    public employee() {
    }

    public int getTienLuong() {
        return tienLuong;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    @Override
    public void inPut() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Phòng ban: ");
        this.phongBan = sc.nextLine();
        System.out.print("Tiền lương: ");
        this.tienLuong = sc.nextInt();
        System.out.print("Tổng số giờ làm việc: ");
        this.soGioLamViec = sc.nextInt();

    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Tiền lương: " + this.tienLuong +
                " | Tổng số giờ làm việc:  " + this.soGioLamViec +
                " | Phòng ban: " + this.phongBan);
    }
    public float tinhThuong() {
        if (soGioLamViec >= 200)
            return tienLuong * 2;
        else if (soGioLamViec >= 100)
            return tienLuong * 0.1f;
        return 0;
    }

    @Override
    public String toString() {
        return "Họ tên: " + hoTen +
                ", Ngày sinh: " + ngaySinh +
                ", giới tính: " + gioiTinh +
                ", địa chỉ: " + diaChi +
                ", tiền lương: " + tienLuong +
                ", số giờ làm việc: " + soGioLamViec +
                ", phòng ban: " + phongBan;

    }
}
