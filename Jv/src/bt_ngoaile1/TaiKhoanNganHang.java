package bt_ngoaile1;

import java.util.Scanner;

public class TaiKhoanNganHang {
    protected int soTK;
    protected String hoTenKH;
    protected String ngaySinh;
    protected int soTienGui;
    protected int soTienRut;

    public TaiKhoanNganHang() {
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên khách hàng: ");
        hoTenKH = sc.nextLine();
        System.out.print("Ngày / tháng / năm sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Số tài khoản: ");
        soTK = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số tiền gửi: ");
        this.soTienGui = sc.nextInt();
        if (this.soTienGui <= 0)
            throw new IllegalArgumentException("Số tiền gửi không hợp lệ!");
        System.out.print("Số tiền muốn rút: ");
        this.soTienRut = sc.nextInt();
    }

    public void display() {
        System.out.println("\t Thông tin khách hàng ");
        System.out.println("Họ và tên: " + this.hoTenKH +
                "| Số tài khoản: " + this.soTK +
                "| Số tiền gửi trong tài khoản: " + this.soTienGui);
    }
}
