package ngoaile;

import java.util.Scanner;

public class NgoaiLeTuDinhNghia {
    public static void nhap() throws MyException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số người: ");
        int nguoi = sc.nextInt();
        if(nguoi<=0)
            throw new MyException();
    }

    public static void main(String[] args) {
        try{
            nhap();
        } catch (MyException e) {
            System.out.println("Lỗi: "+e.toString());
        }
    }
}
