package BaiTapPhanLop;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SoNguyenTo nt0 = new SoNguyenTo(9);
        nt0.out();
        System.out.println("-----------------");

        SoNguyenTo n0 = new SoNguyenTo(11);
        n0.out();
        System.out.println("Số nguyên tố tiếp theo là: " + n0.timSoNguyenToTiepTheo());
        System.out.println("-----------------");

        System.out.print("Nhập một số: ");
        SoNguyenTo nt = new SoNguyenTo();
        nt.setA(sc.nextInt());
        if (nt.isSoNguyenTo(nt.getA())) {
            System.out.println(nt.getA() + " là số nguyên tố");
            System.out.println("Số nguyên tố tiếp theo là: " + nt.timSoNguyenToTiepTheo());
        }
        else
            System.out.println(nt.getA());

    }
}
