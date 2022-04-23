package btkethua3;

import java.util.Scanner;

public class MayTinh extends May{
    private float tocDo;
    private float ram;
    private int hdd;

    @Override
    public void nhapThongTinMay() {
        Scanner scan = new Scanner(System.in);
        super.nhapThongTinMay();
        System.out.print("Tốc độ xử lý: ");
        this.tocDo = scan.nextFloat();
        System.out.print("Dung lượng RAM: ");
        this.ram = scan.nextFloat();
        System.out.print("Dung lượng ổ cứng HDD: ");
        this.hdd =scan.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tốc độ xử lý: "+this.tocDo+
                " | Dung lượng RAM: "+this.ram+
                " | Dung lượng ổ cứng HDD: "+this.hdd);
    }

    @Override
    public String toString() {
        return "tenNSX= '" + tenNSX + '\'' +
                ", diaChi= '" + diaChi + '\'' +
                ", nhanHieu= '" + nhanHieu + '\'' +
                ", giaThanh= " + giaThanh +
                ", tocDo= " + tocDo +
                ", ram= " + ram +
                ", hdd= " + hdd;
    }
}
