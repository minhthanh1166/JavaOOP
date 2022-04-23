package BTKiemTra;

import java.util.Scanner;

public class Mainapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("So khach hang can nhap: ");
        int n = sc.nextInt();

        BienLai[] hoaDon = new BienLai[n];

        for(int i=0;i<n;i++) {
            System.out.println("\t Nhập thông tin cho hoa don khach hang thứ " + (i + 1));
            hoaDon[i] = new BienLai();
            hoaDon[i].nhap();
        }

        for(int i=0;i<n;i++) {
            hoaDon[i].hienThi();
            System.out.println("\n");
        }

    }
}
