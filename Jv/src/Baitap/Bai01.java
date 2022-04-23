package Baitap;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = sc.nextInt();
        if(a%5 ==0 )
            System.out.println("a chia het cho 5");
        else {
            System.out.print( a +"/5 = " + (a/5));
            System.out.print(" du " + (a%5));
        }

    }
}