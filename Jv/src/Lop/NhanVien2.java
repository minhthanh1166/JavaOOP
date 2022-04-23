package Lop;

import java.util.Scanner;

public class NhanVien2 {
    private String HoTen;
    private int Tuoi;
    private String DiaChi;
    private int Luong;

    public void thongTin(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        this.HoTen = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        this.Tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.DiaChi = sc.nextLine();
        System.out.print("Nhập lương: ");
        this.Luong = sc.nextInt();
    }

    public void display(){
        System.out.println("Họ tên: "+this.HoTen +"| Tuổi: "+this.Tuoi+"| Địa chỉ: "+this.DiaChi+"| Lương: "+ this.Luong);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Số lượng nhân viên: ");
        int n = scan.nextInt();
        NhanVien2[] nv = new NhanVien2[n];

        for(int i=0;i<n;i++){
            System.out.println("\t Nhập thông tin cho nhân viên thứ "+(i+1));
            nv[i] = new NhanVien2();
            nv[i].thongTin();
        }
        System.out.println("\t Danh sách nhân viên vừa nhập");
        for(int i=0;i<n;i++){
            System.out.println("Thông tin nhân viên thứ " + (i+1));
            nv[i].display();
        }
        System.out.println("\t Danh sách nhân viên có tuổi dưới 30 và thu nhập trên 500000");
        for(int i=0;i<n;i++){
            if(nv[i].Tuoi < 30 && nv[i].Luong >= 500000)
            nv[i].display();
        }
    }

}