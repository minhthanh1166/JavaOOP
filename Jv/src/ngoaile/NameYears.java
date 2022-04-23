package ngoaile;

import java.util.Scanner;

/*
Viết chương trình nhập vào họ tên, và năm sinh với điều kiện họ tên không quá 25 ký tự, và năm sinh từ 1990 đến 1995
 */
public class NameYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập họ tên: ");
            String name = sc.nextLine();

            if (name.length() > 25)
                throw new IndexOutOfBoundsException("Họ tên vượt quá 25 ký tự!");
            else {
                System.out.println("Họ tên của bạn là: " + name);
            }

        } catch (Exception il) {
            System.out.println(il.getMessage());
        }

        try {
            System.out.print("Nhập năm sinh: ");
            int years = sc.nextInt();
            if (years < 1990 || years > 1995)
                throw new IllegalArgumentException("Năm sinh không nằm trong khoảng hợp lệ!");
            else {
                System.out.println("Năm sinh của bạn là: " + years);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
