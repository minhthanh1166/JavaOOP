package BaiTapPhanLop;

public class Vector {
    // Vector AB có điểm đầu A(x1,y1) và điểm cuối B(x2,y2)
    private int hoanhDoDau;   //x1
    private int tungDoDau;   //y1
    private int hoanhDoCuoi;  //x2
    private int tungDoCuoi;   //y2

    public Vector() {
    }

    public int getHoanhDoDau() {
        return hoanhDoDau;
    }

    public void setHoanhDoDau(int hoanhDoDau) {
        this.hoanhDoDau = hoanhDoDau;
    }

    public int getTungDoDau() {
        return tungDoDau;
    }

    public void setTungDoDau(int tungDoDau) {
        this.tungDoDau = tungDoDau;
    }

    public int getHoanhDoCuoi() {
        return hoanhDoCuoi;
    }

    public void setHoanhDoCuoi(int hoanhDoCuoi) {
        this.hoanhDoCuoi = hoanhDoCuoi;
    }

    public int getTungDoCuoi() {
        return tungDoCuoi;
    }

    public void setTungDoCuoi(int tungDoCuoi) {
        this.tungDoCuoi = tungDoCuoi;
    }

    public void soSanh(int x1, int y1, int x2, int y2){
        if(hoanhDoDau == x1 && tungDoDau == y1 && hoanhDoCuoi == x2 && tungDoCuoi==y2)
            System.out.println("-> Hai vector bằng nhau");
        else
            System.out.println("-> Hai vector không bằng nhau");
    }

}
