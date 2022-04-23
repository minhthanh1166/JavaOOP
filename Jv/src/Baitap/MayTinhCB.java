package Baitap;

import java.util.Scanner;

public class MayTinhCB {
    public static float cong(float a, float b) {
        return a + b;
    }

    public static float tru(float a, float b) {
        return a - b;
    }

    public static float nhan(float a, float b) {
        return a * b;
    }

    public static float chia(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a= ");
        float a = sc.nextFloat();
        System.out.print("Nhập b= ");
        float b = sc.nextFloat();

        System.out.println("Phép tính muốn thực hiện ");
        System.out.println("1/ Cộng ; 2/ Trừ ; 3/ Nhân ; 4/ Chia");
        System.out.print("Lựa chọn: ");
        int phepTinh = sc.nextInt();

        switch(phepTinh){
            case 1:{
                System.out.println("Tổng hai số "+a+ " + "+b+" = "+ cong(a,b));
                break;
            }
            case 2:{
                System.out.println("Hiệu hai số "+a+" - "+b+"="+ tru(a,b));
                break;
            }
            case 3:{
                System.out.println("Phép nhân hai số "+a+" * "+b+" = "+ nhan(a,b));
                break;
            }
            case 4:{
                if(b != 0)
                    System.out.println("Phép chia hai số "+a+"/"+b+"= "+chia(a,b));
                else
                    System.out.println("Syntax Error ");
                break;
            }
            default:{
                System.out.println("No Math");
            }
        }

    }
}
