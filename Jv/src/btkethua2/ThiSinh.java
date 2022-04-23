package btkethua2;


import java.util.Scanner;

public class ThiSinh extends Nguoi2 {
    protected String soBD;
    protected float diemToan;
    protected float diemLy;
    protected float diemHoa;

    @Override
    public void inPut() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Số báo danh: ");
        this.soBD = sc.nextLine();
        do {
            System.out.print("Điểm toán: ");
            this.diemToan = sc.nextFloat();
        }
        while (!(diemToan >= 0) || !(diemToan <= 10));

        do {
            System.out.print("Điểm lý: ");
            this.diemLy = sc.nextFloat();
        }
        while (!(diemLy >= 0) || !(diemLy <= 10));

        do {
            System.out.print("Điểm hóa: ");
            this.diemHoa = sc.nextFloat();
        }
        while (!(diemHoa >= 0) || !(diemHoa <= 10));
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Số báo danh: " + this.soBD +
                " | Điểm toán: " + this.diemToan +
                " | Điểm lý: " + this.diemLy +
                " | Điểm hóa: " + this.diemHoa);
    }

    public void xetThiSinh(float diemChuan) {
        if ((diemToan + diemLy + diemHoa) >= diemChuan) {
            System.out.println("Số báo danh: " + this.soBD +
                    " | Họ và tên: " + getTen() +
                    " | Điểm toán: " + this.diemToan +
                    " | Điểm lý: " + this.diemLy +
                    " | Điểm hóa: " + this.diemHoa +
                    " | Tổng điểm: " + (diemToan + diemLy + diemHoa));
        }
    }
}
