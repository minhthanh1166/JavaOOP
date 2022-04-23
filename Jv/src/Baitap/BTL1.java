package Baitap;

import java.util.Scanner;

public class BTL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập một số: ");
        int n = sc.nextInt();

        int c=n%2;
        System.out.println(c);
    }
}
