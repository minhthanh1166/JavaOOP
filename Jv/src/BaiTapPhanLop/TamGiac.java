package BaiTapPhanLop;

import java.util.Scanner;

public class TamGiac {
    private float a;
    private float b;
    private float c;

    public TamGiac() {
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh thứ 1: ");
        a = sc.nextFloat();
        System.out.print("Nhập độ dài cạnh thứ 2: ");
        b = sc.nextFloat();
        System.out.print("Nhập độ dài cạnh thứ 3: ");
        c = sc.nextFloat();
    }

    public float chuViTamGiac() {
        return a+b+c;
    }

    public float dienTichTamGiac() {
        float p = (a+b+c)/ 2;
        return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public void kieuTamGiac() {
        if (a < b + c && b < a + c && c < a + b) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
                System.out.println("Đây là tam giác vuông");
            else if (a == b && b == c)
                System.out.println("Đây là tam giác đều");
            else if (a == b || a == c || b == c)
                System.out.println("Đây là tam giác cân");
            else
                System.out.println("Đây là tam giác thường");
        } else
            System.out.println("Đây không phải 3 cạnh của tam giác!");
    }

    public void output() {
        System.out.println("Chu vi tam giác là: "+ chuViTamGiac());
        System.out.println(  "Diện tích tam giác là: "+ dienTichTamGiac());
    }
}
