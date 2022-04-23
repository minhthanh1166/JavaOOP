package Lop;

import java.util.Scanner;

public class sinhvien {

    private int maSV;
    private String hoTen;
    private float diemTB;

    // Constructor không tham số (mặc định)
    public sinhvien() {
    }

    // Constructor có tham số
    public sinhvien(int maSV, String hoTen, float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    // phương thức nhập (thông tin sinh viên)
    public void thongTinSV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        maSV = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        diemTB = sc.nextFloat();
    }

    // phương thức xuất (hiển thị) (thông tin sinh viên)
    public void display() {
        System.out.println("Mã sinh viên: " + maSV + " |   Họ Tên: " + hoTen + " |   Điểm trung bình: " + diemTB);
    }

    /*
    public void newThongtin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();

        int[] maSV = new int[n];
        String[] hoTen = new String[n];
        float[] diemTB = new float[n];

        // Nhap thong tin sinh vien
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            System.out.print("Nhập mã sinh viên thứ " + (i + 1) + ": ");
            maSV[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập họ tên của sinh viên thứ " + (i + 1) + ": ");
            hoTen[i] = sc.nextLine();
            System.out.print("Nhập điểm trung bình của sinh viên thứ " + (i + 1) + ": ");
            diemTB[i] = sc.nextFloat();
        }

        // In ra thong tin sinh vien
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin của sinh viên thứ " + (i + 1));
            System.out.print("Mã sinh viên: " + maSV[i] + ",   Họ tên: " + hoTen[i] + ",   Điểm trung bình " + diemTB[i] + "\n");
        }
    }
    */

    public static void main(String[] args) {

        System.out.println(" Thông tin sinh viên ");

        sinhvien sv0 = new sinhvien();
        sv0.display();

        sinhvien sv1 = new sinhvien(112233, "Nguyen Van ABC", 9.5f);
        sv1.display();

        System.out.println(" Nhập thông tin ");
        sinhvien sv2 = new sinhvien();
        sv2.thongTinSV();
        System.out.println(" Thông tin sinh viên ");
        sv2.display();

        /*
        sinhvien sv = new sinhvien();
        sv.newThongtin();
        */
    }
}
