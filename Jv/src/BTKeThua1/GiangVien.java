package BTKeThua1;

import java.util.Scanner;

public class GiangVien extends Nguoi1 {
    private String lopDay;
    private int luongMoiGio;
    private int soGioDay;
    private String buoi;


    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();

        System.out.print("Lớp dạy là buổi sáng, chiều hay tối: ");
        do {
            buoi = sc.nextLine();
            if (buoi.equals("sáng") || buoi.equals("chiều") || buoi.equals("tối"))
                break;
            System.out.print("Nhập lại: ");
        }
        while (true);

        System.out.print("Lớp dạy: ");
        this.lopDay = sc.nextLine();
        System.out.print("Lương mỗi giờ dạy: ");
        this.luongMoiGio = sc.nextInt();
        System.out.print("Số giờ dạy: ");
        this.soGioDay = sc.nextInt();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Lớp dạy: " + this.lopDay +
                "| Lương một giờ dạy: " + this.luongMoiGio +
                "| Số giờ dạy: " + this.soGioDay);
    }

    public int luong() {
        System.out.println("Họ và tên: " + ten +
                " | Lớp dạy: " + lopDay +
                " | Lương một giờ dạy: " + luongMoiGio +
                " | Số giờ dạy: " + soGioDay);

        if (buoi.equals("sáng") || buoi.equals("chiều")) {
            return luongMoiGio * soGioDay;
        } else {
            return luongMoiGio * soGioDay + 200000;
        }
    }

    public String getBuoi() {
        return buoi;
    }

    @Override
    public String toString() {
        return "họ tên: '" + ten + '\'' +
                ", ngày sinh: '" + ngaySinh + '\'' +
                ", giới tính: '" + gioiTinh + '\'' +
                ", địa chỉ: '" + diaChi+
                ", lớp dạy: " + lopDay + '\'' +
                ", lương mỗi giờ: " + luongMoiGio +
                ", số giờ dạy: " + soGioDay +
                ", buổi: '" + buoi + '\'' ;
    }
}
