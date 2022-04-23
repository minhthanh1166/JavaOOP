package BaiTapPhanLop;

public class SoNguyenTo {
    private int a;

    public SoNguyenTo() {
    }

    public SoNguyenTo(int x) {
        if (isSoNguyenTo(x)) {
            this.a = x;
        } else
            System.out.println("Không lưu giá trị "+x);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (isSoNguyenTo(a))
            this.a = a;
        else
            System.out.println("Không thiết lập giá trị "+a);
    }

    public boolean isSoNguyenTo(int x) {
        if (x <= 1)
            return false;
        else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0)
                    return false;
            }
        }
        return true;
    }

    public int timSoNguyenToTiepTheo() {
        int nx = a;
        do {
            if (isSoNguyenTo(getA()))
                nx++;
            else
                break;
        }
        while (!isSoNguyenTo(nx));
        return nx;
    }

    public void out() {
        System.out.println(getA());
    }


}
