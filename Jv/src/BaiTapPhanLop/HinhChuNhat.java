package BaiTapPhanLop;

import java.util.Scanner;

public class HinhChuNhat {
    private float chieuDai;
    private float chieuRong;

    public HinhChuNhat() {
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        chieuDai = sc.nextFloat();
        System.out.print("Nhập chiều rộng: ");
        chieuRong = sc.nextFloat();
    }

    public float chuViHCN(){
        return (chieuDai+chieuRong)*2;
    }

    public float dienTichHCN(){
        return chieuDai*chieuRong;
    }


}
