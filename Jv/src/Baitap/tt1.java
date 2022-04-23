package Baitap;

import java.util.Scanner;

public class tt1 {
    static void hoanDoi(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" a = " + a + " , b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b =sc.nextInt();
        System.out.println("a= "+a+" b= "+b+" hoán đổi: ");
        hoanDoi(a,b);

    }

}
