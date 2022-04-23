package Baitap;

import java.util.Scanner;
/*
Viết chương trình nhập vào một số nguyên n, sau đó tính tổng các số nguyên tố
thuộc đoạn [1..n]. Cho biết có bao nhiêu số nguyên tố thuộc đoạn đó.
 */

public class Bai8 {
    public static boolean soNguyenTo(int n){
        if(n<2)
            return false;
        else if(n!=2 && n%2==0){
            return false;
        }
        else{
            for(int i =3; i<= Math.sqrt(n); i++){
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        int s = 0, dem = 0;
        for(int i =0; i<=n; i++){
            if(soNguyenTo(i)){
                dem++;
                s += i;
            }  
        }
        System.out.println("Tong cac so nguyen to trong khoang tu 1 den " + n + " la: " + s);
        System.out.println(" Co " + dem + " so nguyen to!");

        }

}