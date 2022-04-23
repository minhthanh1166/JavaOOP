package inum;

import java.util.Scanner;

public class SinhVient {
    private String hoTen;
    private String lop;
    private float diemTB;
    private XetLoai loai;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Lớp: ");
        lop = sc.nextLine();
        System.out.println("Điểm trung bình: ");
        diemTB = Float.parseFloat(sc.nextLine());
    }

    public void  xet(){
        if(diemTB >= 8)
            loai = XetLoai.Gioi;
        else if(diemTB >= 6.5)
            loai = XetLoai.Kha;
        else
            loai = XetLoai.TrungBinh;
    }
    public void output(){
        System.out.println("Họ têm: "+hoTen+", Lớp: "+lop+", Điểm trung bình: "+diemTB+", Xếp loại: "+loai.getDescription());
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", lop='" + lop + '\'' +
                ", diemTB=" + diemTB +
                ", loai=" + loai.getDescription() +
                '}';
    }
}
