package Hello;

import java.util.Scanner;

public class vdowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap i = ");
        int i = sc.nextInt();
        while (i < 10) {
            System.out.print("Ban da nhap sai, vui long nhap nhap lai: ");
            i = sc.nextInt();
        }
        System.out.println("Ban da nhap dung!");
    }
}