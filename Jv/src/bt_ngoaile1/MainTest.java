package bt_ngoaile1;

public class MainTest {
    public static void main(String[] args) {
        LoiChuyenTien khachHang = new LoiChuyenTien();

        try {
            khachHang.Nhap();
            khachHang.display();
            khachHang.rutTien();
        }
        catch (Exception il){
            System.out.println(il.getMessage());
        }
    }
}
