package KeThua;

import java.util.Scanner;

public class Employee extends Person {
    private int luong;

    public Employee(String ten, int tuoi, String diaChi, int luong) {
        super(ten, tuoi, diaChi);
        this.luong = luong;
    }

    public Employee() {
    }

    public void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lương: ");
        this.luong = sc.nextInt();
    }

    public void outPut() {
        super.outPut();
        System.out.println(" Lương: "+luong);
    }


}
