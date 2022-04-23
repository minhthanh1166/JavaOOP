package phanso;

public class PhanSo {
    private int tuSo;
    private int mauSo;

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
        if (mauSo != 0) {
            this.mauSo = mauSo;
        }
    }
}
