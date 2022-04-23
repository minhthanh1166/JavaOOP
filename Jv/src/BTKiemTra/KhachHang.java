package BTKiemTra;

import java.util.Scanner;

public class KhachHang {
    protected String maKH;
    protected String tenCH;
    protected int soNha;
    protected String maCT;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenCH, int soNha, String maCT) {
        this.maKH = maKH;
        this.tenCH = tenCH;
        this.soNha = soNha;
        this.maCT = maCT;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenCH() {
        return tenCH;
    }

    public void setTenCH(String tenCH) {
        this.tenCH = tenCH;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaCT() {
        return maCT;
    }

    public void setMaCT(String maCT) {
        this.maCT = maCT;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ma khach hang: ");
        this.maKH = sc.nextLine();
        System.out.println("Ho ten chu ho");
        this.tenCH = sc.nextLine();
        System.out.println("So nha:");
        this.soNha = sc.nextInt();
        sc.nextLine();
        System.out.println("Ma so cong to: ");
        this.maCT = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ma khach hang: " + maKH + ", Ho ten chu ho: " + tenCH + ", so nha: " + soNha + ", Ma so cong to: " + maCT);
    }
}
