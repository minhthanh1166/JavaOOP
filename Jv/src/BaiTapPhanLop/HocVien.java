package BaiTapPhanLop;

import java.util.Scanner;

public class HocVien {
    private String khoaHoc;
    private float diemTK;
    private String viPham;
    private int lanThi;

    public HocVien() {
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public float getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(float diemTK) {
        this.diemTK = diemTK;
    }

    public String getViPham() {
        return viPham;
    }

    public void setViPham(String viPham) {
            this.viPham = viPham;
    }

    public int getLanThi() {
        return lanThi;
    }

    public void setLanThi(int lanThi) {
        this.lanThi = lanThi;
    }



    public void xetHocBong() {
        if (khoaHoc.equals("HDSE") && diemTK >= 75 && viPham.equals("không") && lanThi == 1)
            System.out.println("--> Được học bổng!");
        else
            System.out.println("--> Không được học hổng.");
    }

}
