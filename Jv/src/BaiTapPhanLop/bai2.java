package BaiTapPhanLop;

import java.util.ArrayList;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Số lượng nhân viên: ");
        int n = scan.nextInt();

        NhanVien[] nv = new NhanVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\t Nhập thông tin cho nhân viên thứ " + (i + 1));
            nv[i] = new NhanVien();
            nv[i].thongTinNV();

        }
        System.out.println("\t Danh sách nhân viên ");
        for (int i = 0; i < n; i++) {
            nv[i].display();
            System.out.println(" Tiền thưởng: " + nv[i].tinhThuong());
            System.out.println("\t -----------");
        }

    }
}
