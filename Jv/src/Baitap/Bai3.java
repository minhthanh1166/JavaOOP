package Baitap;

import java.util.Scanner;

/*
Viết chương trình nhập vào số tiền phải trả của khách hàng. In ra số tiền khuyến
mại với quy định: nếu số tiền phải trả thuộc [200, 300) thì khuyến mại 20%. Nếu số tiền
phải trả từ 300 trở lên thì khuyến mại 30%. Còn lại thì không khuyến mại.
 */
public class Bai3 {
    public static float tinhTien(float tien) {
        if (tien >= 200 && tien < 300) {
            System.out.println("Khuyến mại 20%");
            return (float) (tien * 0.2);
        }
        else if (tien > 300) {
            System.out.println("Khuyến mại 30%");
            return (float) (tien * 0.3);
        }
        else
            System.out.println("Không khuyến mại!");
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền khách hàng phải trả: ");
        float tien = sc.nextFloat();
        System.out.println("Số tiền khuyến mại là: " + tinhTien(tien));
    }
}
