package btkethua2;

import java.util.Scanner;

public class Main2 {
    static  ThiSinh[] ts;
    public static void menu() {
        System.out.println("\t Chọn thao tác cần thực hiện");
        System.out.println("1. Nhập thông tin thí sinh");
        System.out.println("2. Hiển thị tất cả thí sinh");
        System.out.println("3. Xét danh sách thí sinh đỗ");
        System.out.println("phím khác để Thoát");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean f = true;
        do {
            menu();
            System.out.print("Nhập lựa chọn: ");
            int c = sc.nextInt();

            switch (c) {
                case 1: {
                    System.out.print("Số lượng thí sinh: ");
                    int n = sc.nextInt();

                    ts = new ThiSinh[n];

                    for (int i = 0; i < ts.length; i++) {
                        System.out.println("Nhập thông tin thí sinh " + (i + 1));
                        ts[i] = new ThiSinh();
                        ts[i].inPut();
                    }
                    break;
                }
                case 2: {
                    System.out.println("Danh sách tất cả thí sinh");
                    for (int i = 0; i < ts.length; i++) {
                        System.out.println("\t Thí sinh " + (i + 1));
                        ts[i].outPut();
                        System.out.println("--------------------");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Nhập điểm chuẩn: ");
                    float diemChuan = sc.nextFloat();

                    System.out.println("\t Danh sách thí sinh đỗ ");
                    System.out.println("---------------------");
                    for (ThiSinh t : ts) {
                        t.xetThiSinh(diemChuan);
                    }
                    break;
                }
                default: {
                    System.err.println("Kết thúc");
                    f = false;
                }
            }

        }
        while (f);
    }
}
