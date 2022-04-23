package BaiTapPhanLop;

import java.util.Scanner;

public class Bai10 {
    public static void nhapVector(Vector vt){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hoành độ điểm đầu (x): ");
        vt.setHoanhDoDau(sc.nextInt());
        System.out.print("Nhập tung độ điểm đầu (y): ");
        vt.setTungDoDau(sc.nextInt());
        System.out.print("Nhập hoành độ điểm cuối (x): ");
        vt.setHoanhDoCuoi(sc.nextInt());
        System.out.print("Nhập tung độ điểm cuối (y): ");
        vt.setTungDoCuoi(sc.nextInt());
    }

    public static void hienThi(Vector vt){
        System.out.println("  điểm đầu ("+vt.getHoanhDoDau()+","+vt.getTungDoDau()+")");
        System.out.println("  điểm cuối ("+vt.getHoanhDoCuoi()+","+vt.getTungDoCuoi()+")");
    }

    public static void main(String[] args) {
        Vector[] vector = new Vector[2];
        for(int i=0;i<vector.length;i++) {
            System.out.println("Vector "+(i+1));
            vector[i] = new Vector();
            nhapVector(vector[i]);
        }

        for(int i=0;i<vector.length;i++) {
            System.out.println("Vector "+(i+1)+" có tọa độ: ");
            hienThi(vector[i]);
        }
        vector[0].soSanh(vector[1].getHoanhDoDau(),vector[1].getTungDoDau(),vector[1].getHoanhDoCuoi(),vector[1].getTungDoCuoi());
    }
}
