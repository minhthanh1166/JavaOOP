package btkethua3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main3 {
    public static int menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t Chọn thao tác cần thực hiện");
        System.out.println("1. Nhập thông tin máy tính");
        System.out.println("2. Hiển thị danh sách thông tin máy tính của IBM");
        System.out.println("3. Hiển thị danh sách máy tính theo giá tăng dần ");
        System.out.println("4. Xóa máy tính Intel khỏi danh sách và hiển thị danh sách sau khi xóa.");
        System.out.println("phím khác để Thoát");
        System.out.println("--------------------");
        System.out.print("Nhập lựa chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<MayTinh> dsmt = new ArrayList<>();

        boolean f = true;
        do {
            switch (menu()) {
                case 1: {
                    System.out.print("Số lượng máy tính: ");
                    int n = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.println("\t Nhập thông tin máy tính thứ " + (i + 1));
                        MayTinh mayTinh = new MayTinh();
                        mayTinh.nhapThongTinMay();
                        dsmt.add(mayTinh);
                    }
                    System.out.println("\t Danh sách máy tính");
                    for (MayTinh mt : dsmt){
                        System.out.println(mt);
                    }
                    break;
                }
                case 2: {
                    System.out.println("\t Danh sách máy tính IBM ");
                    for (MayTinh mt : dsmt) {
                        if (mt.tenNSX.contains("IBM") || mt.tenNSX.contains("ibm")) {
                            System.out.println(mt);
                            System.out.println("--------------------");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("\t Danh sách máy tính theo giá tăng dần");
                   // dsmt.sort(Comparator.comparing(MayTinh::getGiaThanh));
                    dsmt.sort((mt1 , mt2) -> Integer.compare(mt1.giaThanh,mt2.giaThanh));
                    for (MayTinh com : dsmt) {
                        System.out.println(com);
                        System.out.println("--------------------");
                    }
                    break;
                }
                case 4: {
                    int ck = 0;
                    for (int i = 0; i < dsmt.size(); i++) {
                        if(dsmt.get(i).tenNSX.equals("intel")){
                            dsmt.remove(i);
                        }
                    }

                    System.out.println("\t Danh sách sau khi xóa bỏ máy tính hãng intel");
                    for (int i = 0; i < dsmt.size(); i++) {
                        System.out.println(dsmt.get(i));
                        System.out.println("\t -----");
                    }
                    break;
                }
                default: {
                    System.out.println("Kết thúc");
                    f = false;
                }
            }
        }
        while (f);
    }
}
