package baitap_interface;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Round r = new Round();
        System.out.print("Nhập bán kính hình tròn: ");
        r.setRadius(sc.nextDouble());
        r.getPerimetter();
        r.getArea();

        Square sq = new Square();
        System.out.print("Nhập cạnh của hình vuông: ");
        sq.setSide(sc.nextDouble());
        sq.getPerimetter();
        sq.getArea();
    }
}
