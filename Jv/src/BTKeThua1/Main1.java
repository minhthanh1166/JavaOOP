package BTKeThua1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    static ArrayList<GiangVien> dsgv = new ArrayList<>();
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t Chọn thao tác cần thực hiện");
        System.out.println("1. Nhập thông tin giảng viên");
        System.out.println("2. Hiển thị danh sách giảng viên");
        System.out.println("3. Tính lương của giảng viên");
        System.out.println("phím khác: Thoát");
        System.out.println("--------------------");
        System.out.print("Mời lựa chọn: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean f = true;
        do {
            switch (menu()) {
                case 1: {
                    System.out.print("Số lượng giảng viên: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("\t Nhập thông tin cho giảng viên thứ " + (i + 1));
                        GiangVien gv = new GiangVien();
                        gv.nhapThongTin();
                        dsgv.add(gv);
                    }
                    break;
                }

                case 2: {
                    System.out.println("\t   Danh sách giảng viên ");
                    for (int i = 0; i < dsgv.size(); i++) {
                        System.out.println(dsgv.get(i));
                    }
                    break;
                }

                case 3: {
                    System.out.println("\t Bảng lương của giảng viên ");
                    for (int i = 0; i < dsgv.size(); i++) {
                        System.out.println("\t Giảng viên thứ " + (i + 1));
                        System.out.println("Dạy lớp buổi " + dsgv.get(i).getBuoi());
                        System.out.println("-> Lương: " + dsgv.get(i).luong());
                        System.out.println("----------");
                    }
                    break;
                }
                default: {
                    System.out.println("Kết thúc!");
                    f = false;
                }
            }
        }
        while (f);
    }
}
