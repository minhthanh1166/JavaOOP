package inum;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    static ArrayList<SinhVient> dssv = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số lượng sinh viên: ");
        int n =sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Sinh viên "+(i+1));
            SinhVient sv = new SinhVient();
            sv.input();
            dssv.add(sv);
        }

        for (SinhVient sv : dssv) {
            sv.xet();
            System.out.println(sv);
        }
    }
}
