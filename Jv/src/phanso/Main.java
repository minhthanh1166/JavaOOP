package phanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhanSo ps = new PhanSo();
        System.out.print("Nhập tử số: ");
        ps.setTuSo(sc.nextInt());
        System.out.print("Nhập mẫu số: ");
        ps.setMauSo(sc.nextInt());
        if(ps.getMauSo() != 0)
           System.out.println("Phân số: "+ps.getTuSo()+"/"+ps.getMauSo());

    }


}
