package BaiTapPhanLop;

import java.util.Scanner;

public class bai3 {

    //nhập thông tin
    public static void inputInfor(Student sv) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Mã sinh viên (8 ký tự): ");
            sv.setMaSV(sc.nextLine());
        }
        while (sv.getMaSV().length() != 8);

        System.out.print("Họ và tên: ");
        sv.setHoTen(sc.nextLine());

        do {
            System.out.print("Lớp (ký tự đầu tiên là A hoặc C ): ");
            sv.setLop(sc.nextLine());
        }
        while (!(sv.getLop().charAt(0) == 'A' || sv.getLop().charAt(0) == 'C'));

        do {
            System.out.print("Tuổi (18+): ");
            sv.setTuoi(sc.nextInt());
        }
        while (sv.getTuoi() < 18);

        do {
            System.out.print("Điểm trung bình (0-->10): ");
            sv.setDiemTB(sc.nextFloat());
        }
        while (sv.getDiemTB() < 0 || sv.getDiemTB() > 10);
    }

    //hiển thị thông tin
    public static void outputInfor(Student sv) {
        System.out.println("Mã sinh viên: " + sv.getMaSV() +
                " | Họ tên: " + sv.getHoTen() +
                " | Tuổi: " + sv.getTuoi() +
                " | Lớp: " + sv.getLop() +
                " | Điểm trung bình: " + sv.getDiemTB());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Số lượng sinh viên: ");
        int n = sc.nextInt();

        Student[] sv = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\t Nhập thông tin cho sinh viên thứ " + (i + 1));
            sv[i] = new Student();
            inputInfor(sv[i]);
        }

        System.out.println("\t Danh sách sinh viên ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1));
            outputInfor(sv[i]);
            sv[i].xetHocBong();
            System.out.println("\t --------------------");
        }

    }
}
