package Baitap;

import java.util.Scanner;

/*
Viết chương trình sau kiểm tra một số có phải là số nguyên tố hay không.
Định nghĩa: số nguyên tố là số lớn hơn 1 và chỉ chia hết cho 1 và chính nó. Ví dụ: 2, 3,
5, 7, 11, 13, 17, ... là những số nguyên tố. Chú ý: Số 0 và 1 không phải là số nguyên tố.
Chỉ có số 2 là số nguyên tố chẵn, tất cả các số chẵn khác không phải là số nguyên tố vì
chúng chia hết cho 2.
 */
public class Bai7 {
    public static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        if (check(n)) {
            System.out.println(n + " là số nguyên tố! ");
        } else {
            System.out.println(n + " không phải là số nguyên tố! ");
        }

    }
}

