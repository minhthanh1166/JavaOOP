package kiemtra;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("\t Chọn thao tác cần thực hiện");
        System.out.println("1. Nhập thông tin sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Lấy bảng điểm theo lớp ");
        System.out.println("4. Hiển thị danh sách sinh viên theo điểm trung bình giảm dần");
        System.out.println("5. Hiển thị sách sinh viên được học bổng (điểm trung bình trên 7.0)");
        System.out.println("Phím khác để thoát");
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien[] sv = null;

        boolean f = true;

        do {
            menu();
            System.out.print("Mời lựa chọn: ");
            int c = sc.nextInt();

            switch (c) {
                case 1: {
                    System.out.print("Số lượng sinh viên cần nhập: ");
                    int n = sc.nextInt();

                    sv = new SinhVien[n];

                    for (int i = 0; i < sv.length; i++) {
                        System.out.println("\t Nhập thông tin cho sinh viên thứ " + (i + 1));
                        sv[i] = new SinhVien();
                        sv[i].inPut();
                    }
                    break;
                }
                case 2: {
                    System.out.println("\t Danh sách sinh viên");
                    for (int i = 0; i < sv.length; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1));
                        sv[i].outPut();
                        System.out.println("--------------------");
                    }
                    break;
                }
                case 3: {//Đưa ra bảng điểm của một lớp bất kỳ

                    System.out.print("Nhập lớp cần lấy bảng điểm: " + sc.nextLine());
                    String nlop = sc.nextLine();

                    for (int i = 0; i < sv.length; i++) {
                        if (sv[i].getLop().equals(nlop)) {
                            sv[i].outPut();
                            System.out.println("--------------------");
                        }
                    }
                    break;
                }
                case 4: {// Sắp xếp danh sách các sinh viên giảm dần theo điểm trung bình.
                    for (int i = 0; i < sv.length; i++) {
                        for (int j = i + 1; j < sv.length; j++) {
                            if (sv[i].getDiemTB() < sv[j].getDiemTB()) {
                                SinhVien temp = sv[i];
                                sv[i] = sv[j];
                                sv[j] = temp;
                            }
                        }
                    }

                    System.out.println("\t Danh sách sinh viên theo điểm trung bình");
                    for (int i = 0; i < sv.length; i++) {
                        sv[i].outPut();
                        System.out.println("--------------------");
                    }
                    break;
                }
                case 5: { // Đưa ra danh sách sinh viên được học bổng.
                    System.out.println("\t Danh sách sinh viên được học bổng ");
                    for (int i = 0; i < sv.length; i++) {
                        if (sv[i].getDiemTB() >= 7) {
                            sv[i].outPut();
                            System.out.println("--------------------");
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Thoát");
                    f = false;
                }
            }
        }
        while (f);

    }
}
