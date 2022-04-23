package Baitap;

import java.util.Scanner;

/*
Viết chương trình tìm n số Fibonacci đầu tiên trong java. Số nguyên dương n được
nhập từ bàn phím. Quy luật của dãy số Fibonacci: số tiếp theo bằng tổng của 2 số trước,
2 số đầu tiên của dãy số là 0, 1. Ví dụ: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 */
public class Bai9 {
    public static int fibonacci(int n) {
        if (n < 0)
            return -1;
        else if (n == 0 || n == 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);

    }

        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
            int n = sc.nextInt();
        System.out.println(n + " so Fibonacci dau tien la: ");
        for (int i = 0; i <n; i++) {
                System.out.print(fibonacci(i) + "  ");
        }

   }
}
