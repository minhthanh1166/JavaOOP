package bt_kethua_them;

import java.util.Scanner;

public class NhanVien extends Nguoi{
    private int tienLuong;
    private int soGioLamViec;
    private String phongBan;

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public NhanVien() {
        super();
    }

    public int getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(int tienLuong) {
        this.tienLuong = tienLuong;
    }

    public String getPhongBan() {
        return phongBan;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Phòng ban: ");
        this.phongBan = sc.nextLine();
        System.out.print("Tiền lương: ");
        this.tienLuong = sc.nextInt();
        System.out.print("Tổng số giờ làm việc: ");
        this.soGioLamViec = sc.nextInt();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
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
}
