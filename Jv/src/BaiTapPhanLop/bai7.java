package BaiTapPhanLop;

public class bai7 {
    public static void main(String[] args){
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.input();
        System.out.println("Chu vi hình chữ nhật là: "+hcn.chuViHCN());
        System.out.println("Diện tích hình chữ nhật là: "+hcn.dienTichHCN());
    }
}
