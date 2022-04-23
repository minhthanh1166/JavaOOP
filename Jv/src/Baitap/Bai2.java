package Baitap;

import java.util.Scanner;

//Viết chương trình hoán đổi hai số nguyên.
public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,x;
        System.out.print("Nhap a = ");
        a = sc.nextInt();
        System.out.print("Nhap b = ");
        b = sc.nextInt();
        System.out.println("Gia tri ban dau la: " + "a = " + a + ", b = " + b);
        x = a;
        a = b;
        b = x;
        System.out.println("Gia tri sau khi hoan doi la: " + " a = " + a + ", b = " + b);

    }
}
