package KeThua;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Person {
    protected String ten;
    protected int tuoi;
    protected String diaChi;

    public Person() {
    }

    public Person(String ten, int tuoi, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public void inPut(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.ten = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        this.tuoi = parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        this.diaChi = sc.nextLine();
    }

    public void outPut(){
        System.out.println("Tên: "+ten+ ", Tuổi: "+tuoi+", Địa chỉ: "+diaChi);
    }
}
