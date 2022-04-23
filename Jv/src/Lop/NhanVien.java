package Lop;

import java.util.Scanner;

public class NhanVien {
    private String HoTen;
    private int Tuoi;
    private String DiaChi;
    private int Luong;

    public NhanVien() {
    }

    public void setThongTin() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập họ và tên của nhân viên: ");
        HoTen = scan.nextLine();

        System.out.print("Nhập tuổi của nhân viên: ");
        Tuoi = scan.nextInt();
        scan.nextLine();

        System.out.print("Nhập địa chỉ của nhân viên: ");
        DiaChi = scan.nextLine();

        System.out.print("Nhập lương của nhân viên: ");
        Luong = scan.nextInt();

    }

    public void display() {
        System.out.println(" Thông tin nhân viên ");
        System.out.println("Họ tên: " + HoTen +
                " | Tuổi: " + Tuoi +
                " | Địa chỉ: " + DiaChi +
                " | Lương: " + Luong);

    }

    public void thongTinNhanVien() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Số lượng nhân viên: ");
        int n = sc.nextInt();

        String[] HoTen = new String[n];
        int[] Tuoi = new int[n];
        String[] DiaChi = new String[n];
        int[] Luong = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\t Nhập thông tin cho nhân viên thứ " + (i + 1) + sc.nextLine());

            System.out.print("Họ và tên của nhân viên thứ " + (i + 1) + ": ");
            HoTen[i] = sc.nextLine();

            System.out.print("Tuổi của nhân viên thứ " + (i + 1) + ": ");
            Tuoi[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Địa chỉ của nhân viên thứ " + (i + 1) + ": ");
            DiaChi[i] = sc.nextLine();

            System.out.print("Lương của nhân viên thứ " + (i + 1) + ": ");
            Luong[i] = sc.nextInt();

        }

        System.out.println("\t Danh sách nhân viên có tuổi dưới 30 và thu nhập trên 500000");
        for (int i = 0; i < n; i++) {
            if (Tuoi[i] < 30 && Luong[i] >= 500000)
                System.out.println("Họ tên: " + HoTen[i] +
                        " | Tuổi: " + Tuoi[i] +
                        " | Địa chỉ: " + DiaChi[i] +
                        " | Lương: " + Luong[i]);
            else {
                System.out.println("Không có nhân viên nào! ");
                break;

            }
        }
    }

    public static void main(String[] args) {
        NhanVien nhanvien = new NhanVien();
        nhanvien.setThongTin();
        nhanvien.display();

        NhanVien danhsach = new NhanVien();
        danhsach.thongTinNhanVien();

    }
}

