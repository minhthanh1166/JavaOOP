package BaiTapPhanLop;


public class Student {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private String lop;
    private float diemTB;

    public Student() {
    }

    public Student(String maSV, String hoTen, int tuoi, String lop, float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.lop = lop;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
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


    //xét học bổng
    public void xetHocBong() {
        if (diemTB >= 8)
            System.out.println("--> Được học bổng!");
        else
            System.out.println("-> Không được học bổng.");
    }


}
