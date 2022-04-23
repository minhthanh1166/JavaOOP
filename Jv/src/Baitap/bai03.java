package Baitap;

import java.util.Scanner;

public class bai03 { //Bai3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, delta;
        double x1, x2;
        System.out.print("nhap a = ");
        a = sc.nextFloat();
        System.out.print("nhap b = ");
        b = sc.nextFloat();
        System.out.print("nhap c = ");
        c = sc.nextFloat();
        delta = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Day la phuong trinh bac 1 co dang: bx + c = 0");
            if(b == 0) {
                if(c != 0)
                System.out.print("Phuong trinh vo nghiem!");
                else
                    System.out.print("Phuong trinh vo so nghiem.");
            }
            else {
                x1 = -c / b;
                System.out.println("nghiem cua phuong trinh la : " + x1);
            }
        }
        else {
            if (delta > 0) {
                x1 = ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phuong trinh co 2 nghiem phan biet: " + x1 + " va " + x2);
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
            } else
                System.out.println("Phuong trinh vo nghiem!");
        }
    }
}
