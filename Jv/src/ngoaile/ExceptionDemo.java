package ngoaile;

import java.util.Scanner;

public class ExceptionDemo {
    public static void ps(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else
            System.out.println("Kết quả: " + ( (float) a/b));
    }

    public static void main(String[] args) {
        int tuso, mauso;
        System.out.println("Chương trình tính phân số ");
        Scanner ca =new Scanner(System.in);
        System.out.print("Tử số: ");
        tuso = ca.nextInt();
        System.out.print("Mẫu số: ");
        mauso = ca.nextInt();
        try{
            ps(tuso,mauso);
        }
        catch(ArithmeticException a){
            System.out.println("Error: "+ a);
        }

        System.out.println("Chạy đến đây! ");
        ca.close();
    }
}
