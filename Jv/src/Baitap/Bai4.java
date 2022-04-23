package Baitap;

import java.util.Scanner;

/*
Viết chương trình nhập vào một số nguyên n trong khoảng [10, 20] (nếu số nhập
vào không thuộc khoảng đó thì yêu cầu nhập lại tới khi thoả mãn). Sau đó tính tổng các
số liên tiếp từ 1 tới n.
 */
public class Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        while(n<10 || n>20){
            System.out.print("Ban da nhap sai, moi nhap lai: ");
            n = sc.nextInt();
        }
        int S=0;
        for(int i=1;i<=n;i++){
            S += i;
        }
        System.out.println("Tong cac so tu 1 den " + n + " la: " + S);

    }
}
