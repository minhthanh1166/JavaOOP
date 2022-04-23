package BaiTapPhanLop;

import java.util.Scanner;

public class bai4 {
    public static void thongTinHV(HocVien hv) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Khóa học: ");
        hv.setKhoaHoc(scan.nextLine());
        do {
            System.out.print("Điểm tổng kết (0-->100): ");
            hv.setDiemTK(scan.nextFloat());
            scan.nextLine();
        }
        while (hv.getDiemTK() < 0 || hv.getDiemTK() > 100);

        do {
            System.out.print("Vi phạm nội quy (có hoặc không): ");
            hv.setViPham(scan.nextLine());
        }
        while (!(hv.getViPham().equals("có") || hv.getViPham().equals("không")));

        System.out.print("Lần thi: ");
        hv.setLanThi(scan.nextInt());
    }

    public static void output(HocVien hv) {
        System.out.println("Khóa học: " + hv.getKhoaHoc() +
                " | Điểm tổng kết: " + hv.getDiemTK() +
                " | Vi phạm nội quy: " + hv.getViPham() +
                " | Lần thi: " + hv.getLanThi());
    }

    public static void menu() {
        System.out.println("\t Chọn thao tác cần thực hiện");
        System.out.println("1. Nhập thông tin");
        System.out.println("2. Hiển thị danh sách và xét học bổng");
        System.out.println("3. Thoát");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HocVien[] hv = null;
        boolean tf = true;
        do {
            menu();
            System.out.print("Nhập lựa chọn: ");
            int a = sc.nextInt();
            switch (a) {
                case 1: {
                    System.out.print("Số lượng học viên cần nhập: ");
                    int n = sc.nextInt();
                    hv = new HocVien[n];
                    for (int i = 0; i < hv.length; i++) {
                        System.out.println("Nhập thông tin của học viên " + (i + 1));
                        hv[i] = new HocVien();
                        thongTinHV(hv[i]);
                    }
                    break;
                }
                case 2: {
                    System.out.println("\t Danh sách học viên");
                    for (int i = 0; i < hv.length; i++) {
                        System.out.println("Học viên " + (i + 1));
                        output(hv[i]);
                        hv[i].xetHocBong();
                    }
                    System.out.println("\t -------------------");
                    break;
                }
                default: {
                    System.out.println("Kết thúc");
                    tf = false;
                }
            }
        }
        while (tf);
    }
}

