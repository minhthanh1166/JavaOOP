package Baitap;

import java.util.Scanner;

public class hoandoithamtri {
    static void hoanDoi(int a, int b){
        int tg = a;
        a = b;
        b = tg;
        System.out.println("Các số sau khi hoán đổi là: a= "+a+", b= "+b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a= ");
           int a = sc.nextInt();
        System.out.print("Nhập b= ");
           int b = sc.nextInt();
        System.out.println("Giá trị ban đầu là: a= "+a+", b= "+b);
        hoanDoi(a,b);
    }
}
