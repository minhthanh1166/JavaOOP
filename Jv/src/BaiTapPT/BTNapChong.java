package BaiTapPT;

import java.util.Scanner;

public class BTNapChong {

    public static float dienTich(float x) {
        System.out.print("Dien tich hinh vuong: ");
        return x * x;
    }

    public static float dienTich(float x, float y) {
        System.out.print("Dien tich hinh chu nhat: ");
        return x * y;
    }

    public static double dienTich(float x, float y, float z) {
        System.out.print("Dien tich hinh tam giac: ");
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x= ");
        float x = sc.nextFloat();
        System.out.print("Nhập y= ");
        float y = sc.nextFloat();
        System.out.print("Nhập z= ");
        float z = sc.nextFloat();

        System.out.println(BTNapChong.dienTich(x, y, z));
        System.out.println(BTNapChong.dienTich(x, y));
        System.out.println(BTNapChong.dienTich(x));
    }
}