package Baitap;

import java.util.Scanner;
/*
Một người gửi tiết kiệm a đồng với lãi suất s% một tháng (tính lãi hàng tháng).
Viết một chương trình tính và in ra màn hình hai cột song song, cột thứ nhất là số tháng
đã gửi, cột thứ hai tổng số tiền (cả vốn và lãi) ứng với số tháng ở cột thứ nhất cho một
khoảng thời gian từ 1 đến t tháng, với a, s, t được nhập từ bàn phím.
 */

public class Bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien gui tiet kiem: ");
             float a = sc.nextFloat();
        System.out.print("nhap lai suat hang thang: ");
             float s = sc.nextFloat();
        System.out.print("nhap so thang tiet kiem: ");
             int t =sc.nextInt();
        System.out.print("So thang da gui   ");
        System.out.print("Tong so tien ");
        for (int i = 1;i<=t;i++){
            a = a * (1+s/100);
            System.out.print( "\n       " + i + "            " + a + "       \n");

        }


    }
}
