package Baitap;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a,b,x;
        System.out.print("nhap a = ");
        a = sc.nextFloat();
        System.out.print("nhap b = ");
        b =sc.nextFloat();
        if (a == 0) {  // 0x + b = 0
            if(b != 0)
            System.out.println("Phuong trinh vo nghiem!");
            else
                System.out.print("Phuong trinh vo so nghiem.");
        }
        else{
            // ax + b = 0
            x = -b / a;
            System.out.print("phuong trinh co nghiem x = " + x);
        }
    }
}
