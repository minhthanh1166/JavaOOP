package Hello;

import java.util.Scanner;

public class vdfor1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n = ");
        int n = sc.nextInt();
        int S = 0;
        for (int i = 0; i <= n; i++){
            S+= i;
        }

        System.out.println("Tong cua n so la: " + S);


    }
}
