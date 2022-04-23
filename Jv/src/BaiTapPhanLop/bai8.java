package BaiTapPhanLop;

public class bai8 {
    public static void main(String[] args) {
        PhanSo[] ps = new PhanSo[2];

        System.out.println("\t Nhập phân số ");
        ps[0] = new PhanSo();
        ps[0].nhapPS();
        ps[0].nghichDao(ps[0].getTuSo(),ps[0].getMauSo());

        System.out.println("\t Nhập phân số tiếp theo");
        ps[1] = new PhanSo();
        ps[1].nhapPS();
        ps[1].rutGon(ps[1].getTuSo(),ps[1].getMauSo());

        System.out.println("\t ---------------");

        System.out.println("Tổng hai phân số là: ");
        ps[0].add(ps[1].getTuSo(), ps[1].getMauSo());

        System.out.println("\t ---------------");

        System.out.println("Hiệu hai phân số là: ");
        ps[0].sub(ps[1].getTuSo(), ps[1].getMauSo());

        System.out.println("\t ---------------");

        System.out.println("Tích hai phân số là: ");
        ps[0].mul(ps[1].getTuSo(), ps[1].getMauSo());

        System.out.println("\t ---------------");

        System.out.println("Chia hai phân số: ");
        ps[0].div(ps[1].getTuSo(), ps[1].getMauSo());

    }

}