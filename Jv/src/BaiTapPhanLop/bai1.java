package BaiTapPhanLop;

import java.util.Scanner;

public class bai1 {

    //Nhập thông tin
    public static void thongTinGV(GiangVien gv) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        gv.setHoTen(sc.nextLine());
        System.out.print("Ngày sinh: ");
        gv.setNgaySinh(sc.nextLine());
        System.out.print("Giới tính: ");
        gv.setGioiTinh(sc.nextLine());
        System.out.print("Khoa: ");
        gv.setKhoa(sc.nextLine());
        System.out.print("Trình độ: ");
        gv.setTrinhDo(sc.nextLine());
        System.out.print("Phụ cấp: ");
        gv.setPhuCap(sc.nextFloat());
        System.out.print("Số tiết dạy: ");
        gv.setSoTietDay(sc.nextInt());
        System.out.print("Hệ số lương: ");
        gv.setHeSoLuong(sc.nextFloat());
    }

    // hiển thị
    public static void display(GiangVien gv) {
        System.out.println("Họ tên: " + gv.getHoTen() +
                " | Ngày sinh: " + gv.getNgaySinh() +
                " | Giới tính: " + gv.getGioiTinh() +
                " | Khoa: " + gv.getKhoa() +
                " | Trình độ: " + gv.getTrinhDo() +
                " | Phụ cấp: " + gv.getPhuCap() +
                " | Số tiết dạy: " + gv.getSoTietDay() +
                " | Hệ số lương: " + gv.getHeSoLuong());
    }

    public static void menu() {
        System.out.println("\t Chọn thao tác cần thực hiện");
        System.out.println("1. Nhập thông tin");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Tính tổng lương phải trả");
        System.out.println("4. Thoát");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiangVien[] gv = null;
        boolean tf = true;
        do {
            menu();
            System.out.print("Nhập lựa chọn: ");
            int a = sc.nextInt();
            switch (a) {
                case 1 -> {
                    System.out.print("Số lượng giảng viên: ");
                    int n = sc.nextInt();
                    gv = new GiangVien[n];
                    for (int i = 0; i < gv.length; i++) {
                        System.out.println("\t Nhập thông tin cho giảng viên thứ " + (i + 1));
                        gv[i] = new GiangVien();
                        thongTinGV(gv[i]);
                        gv[i].luong();  // tính lương của từng giảng viên
                    }

                }
                case 2 -> {
                    System.out.println("\t Danh sách giảng viên ");
                    assert gv != null;
                    for (GiangVien giangVien : gv) {
                        display(giangVien);
                    }
                    System.out.println("\t --------------------");

                }
                case 3 -> {
                    // tính tổng lương phải trả
                    int tongLuong = 0;
                    assert gv != null;
                    for (GiangVien giangVien : gv) {
                        tongLuong += giangVien.luong();
                    }
                    System.out.println(" Tổng lương phải trả cho giảng viên trong trường: " + tongLuong);
                    System.out.println("--------------------");

                }
                default -> {
                    System.out.println("Kết thúc");
                    tf = false;
                }
            }
        }
        while (tf);
    }
}
