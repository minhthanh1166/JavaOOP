package Baitap;

import java.util.Scanner;
/*
Người gửi tiết kiệm a đồng với lãi suất là s% một tháng trong kỳ hạn 6 tháng (6
tháng tính lãi một lần). Viết chương trình tính và in ra màn hình hai cột song song, cột
thứ nhất là số tháng đã gửi, cột thứ hai là tổng tiền (cả vốn và lãi) ứng với số tháng ở cột
thứ nhất cho một khoảng thời gian từ 6 tháng đến t tháng, với a, s, và t được nhập từ bàn
phím (Biết rằng nếu lĩnh không chẵn kỳ nào thì không được tính lãi kỳ ấy).
 */
public class Bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien gui tiet kiem: ");
             float a = sc.nextFloat();
        System.out.print("nhap lai suat hang thang: ");
             float s = sc.nextFloat();
        System.out.print("nhap so thang tiet kiem: ");
             int t =sc.nextInt();
        System.out.print("So thang da gui   ");
        System.out.print("Tong so tien");
        for (int i = 1;i<=t;i++){
            if(i%6==0)
                for(int k=0;k<6;k++){
                    a *= (1+s/100);
                }
            System.out.print( "\n       " + i + "            " + a + "       \n");
        }

    }
}
