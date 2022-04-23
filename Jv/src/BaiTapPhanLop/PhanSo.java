package BaiTapPhanLop;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo != 0)
            this.mauSo = mauSo;
    }

    public void nhapPS() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        this.tuSo = scan.nextInt();
        do {
            System.out.print("Nhập mẫu số: ");
            this.mauSo = scan.nextInt();
        }
        while (mauSo == 0);
    }

    public void display() {
        if (mauSo == 0)
            System.out.println("Phân số không tồn tại");
        else
            System.out.println("Phân số: " + tuSo + "/" + mauSo);
    }

    public void nghichDao(int ts, int ms) {
        int d = ts;
        ts = ms;
        ms = d;
        System.out.println(tuSo + "/" + mauSo + " nghịch đảo = " + ts + "/" + ms);

    }

    public void rutGon(int tuSo, int mauSo) {
        // tìm ước chung lớn nhất (giải thuật Eur-clid)
        int n1 = tuSo;
        int n2 = mauSo;
        while (n1 != n2) {
            if (n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        //rút gọn (chia tử và mẫu cho ước chung lớn nhất)
        int ts = tuSo / n1;
        int ms = mauSo / n1;
        System.out.println(tuSo + "/" + mauSo + " rút gọn = " + ts + "/" + ms);
    }

    //cộng hai phân số
    public void add(int tuSo2, int mauSo2) {

        if (mauSo == mauSo2) {
            int ts = tuSo + tuSo2;
            System.out.println(tuSo + "/" + mauSo + " + " + tuSo2 + "/" + mauSo2 + " = " + ts + "/" + mauSo);
        } else {
            int ts1 = tuSo * mauSo2;
            int ts2 = tuSo2 * mauSo;
            int ms = mauSo * mauSo2;
            int ts = ts1 + ts2;
            System.out.println(tuSo + "/" + mauSo + " + " + tuSo2 + "/" + mauSo2 + " = " + ts + "/" + ms);
        }

    }

    //trừ hai phân số
    public void sub(int tuSo2, int mauSo2) {

        if (mauSo == mauSo2) {
            int ts = tuSo - tuSo2;
            System.out.println(tuSo + "/" + mauSo + " - " + tuSo2 + "/" + mauSo2 + " = " + ts + "/" + mauSo);
        } else {
            int ts1 = tuSo * mauSo2;
            int ts2 = tuSo2 * mauSo;
            int ms = mauSo * mauSo2;
            int ts = ts1 - ts2;
            System.out.println(tuSo + "/" + mauSo + " - " + tuSo2 + "/" + mauSo2 + " = " + ts + "/" + ms);
        }
    }

    //nhân hai phân số
    public void mul(int tuSo2, int mauSo2) {
        int ts = tuSo * tuSo2;
        int ms = mauSo * mauSo2;
        System.out.println(tuSo + "/" + mauSo + " * " + tuSo2 + "/" + mauSo2 + " = " + ts + "/" + ms);
        rutGon(ts, ms);
    }

    //chia hai phân số
    public void div(int tuSo2, int mauSo2) {
        int ts = tuSo * mauSo2;
        int ms = mauSo * tuSo2;
        System.out.println(tuSo + "/" + mauSo + " : " + tuSo2 + "/" + mauSo2 + " = " + ts + "/" + ms);
        rutGon(ts, ms);
    }


}
