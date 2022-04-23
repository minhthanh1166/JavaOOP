package BTKiemTra;

import java.util.Scanner;

public class BienLai extends KhachHang {
    protected int chiSoMoi;
    protected int chiSoCu;
    protected int thangSD;


    public BienLai() {
    }

    public BienLai(String maKH, String tenCH, int soNha, String maCT, int chiSoMoi, int chiSoCu, int thangSD) {
        super(maKH, tenCH, soNha, maCT);
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
        this.thangSD = thangSD;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Chi so cu: ");
        this.chiSoCu = sc.nextInt();
        System.out.println("Chi so moi: ");
        this.chiSoMoi = sc.nextInt();
        System.out.println("Thang su dung: ");
        this.thangSD = sc.nextInt();
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Chi so cu: " + chiSoCu + ", chi so moi: " + chiSoMoi + ", thang su dung: " + thangSD);
    }

    public int getSoMoi() {
        return chiSoMoi;
    }

    public void setSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public int getSoCu() {
        return chiSoCu;
    }

    public void setSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getThangSD() {
        return thangSD;
    }

    public void setThangSD(int thangSD) {
        this.thangSD = thangSD;
    }

    public int tinhTien() {
        int thanhTien = (chiSoMoi - chiSoCu) * 450;
        return thanhTien;

    }

}
