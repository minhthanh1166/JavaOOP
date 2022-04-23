package kiemtra;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    //Mã sinh viên, lớp, điểm trung bình.
    private String maSV;
    private String lop;
    private float diemTB;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String gioiTinh, String ngaySinh, String maSV, String lop, float diemTB) {
        super(hoTen, gioiTinh, ngaySinh);
        this.maSV = maSV;
        this.lop = lop;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public void inPut() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Mã sinh viên: ");
        this.maSV = sc.nextLine();
        System.out.print("Lớp: ");
        this.lop = sc.nextLine();
        System.out.print("Điểm trung bình: ");
        this.diemTB = sc.nextFloat();
        sc.nextLine();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Mã sinh viên: "+this.maSV+
                " | Lớp: "+this.lop+
                " | Điểm trung bình: "+this.diemTB);
    }
}
