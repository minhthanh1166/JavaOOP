package bt_ngoaile1;

public class LoiChuyenTien extends TaiKhoanNganHang {

    public void rutTien() throws IllegalArgumentException {
        if(this.soTienRut > super.soTienGui)
            throw new IllegalArgumentException("Thao tác rút tiền không hợp lệ! Số tiền cần rút lớn hơn số tiền có trong tài khoản!");
        else
            System.out.println("Rút thành công: " + soTienRut + ", vui lòng chờ!");
    }
}
