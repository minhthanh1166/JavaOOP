package BaiTapPhanLop;

import java.util.Scanner;

public class bai9 {
    public static void nhapSoPhuc(SoPhuc sp){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần thực: ");
        sp.setPhanThuc(scanner.nextInt());
        System.out.print("Nhập phần ảo: ");
        sp.setPhanAo(scanner.nextInt());
    }

    public static void display(SoPhuc sp){
        //a+bi
        System.out.println("Số phức: "+sp.getPhanThuc()+"+("+sp.getPhanAo()+")i");
    }

    public static void main(String[] args) {
        SoPhuc[] sp = new SoPhuc[2];
        sp[0] = new SoPhuc();
        nhapSoPhuc(sp[0]);
        display(sp[0]);

        sp[1] = new SoPhuc();
        nhapSoPhuc(sp[1]);
        display(sp[1]);
        System.out.println("Tổng hai số phức là: ");
        sp[0].cong(sp[1].getPhanThuc(),sp[1].getPhanAo());
        System.out.println("Hiệu hai số phức");
        sp[0].tru(sp[1].getPhanThuc(),sp[1].getPhanAo());
        System.out.println("Tích hai số phức");
        sp[0].nhan(sp[1].getPhanThuc(),sp[1].getPhanAo());
        System.out.println("Phép chia hai số phức: ");
        sp[0].chia(sp[1].getPhanThuc(),sp[1].getPhanAo());
    }

}
