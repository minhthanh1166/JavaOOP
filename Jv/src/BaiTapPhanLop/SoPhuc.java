package BaiTapPhanLop;

public class SoPhuc {
    // a+bi
    private int phanThuc;
    private int phanAo;

    public SoPhuc() {
    }

    public int getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(int phanThuc) {
        this.phanThuc = phanThuc;
    }

    public int getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(int phanAo) {
        this.phanAo = phanAo;
    }

    public void cong(int phanThuc2, int phanAo2) {
        int pt = phanThuc + phanThuc2;
        int pa = phanAo + phanAo2;
        System.out.println("" + phanThuc + "+(" + phanAo + "i) + " + phanThuc2 + "+(" + phanAo2 + "i) = " + pt + "+(" + pa + "i)");
    }

    public void tru(int phanThuc2, int phanAo2) {
        int pt = phanThuc - phanThuc2;
        int pa = phanAo - phanAo2;
        System.out.println("" + phanThuc + "+(" + phanAo + "i) - " + phanThuc2 + "+(" + phanAo2 + "i) = " + pt + "+(" + pa + "i)");
    }

    public void nhan(int phanThuc2, int phanAo2) {
        int pt = (phanThuc * phanThuc2) - (phanAo * phanAo2);
        int pa = (phanThuc * phanAo2) + (phanAo * phanThuc2);
        System.out.println("" + phanThuc + "+(" + phanAo + "i) * " + phanThuc2 + "+(" + phanAo2 + "i) = " + pt + "+(" + pa + "i)");
    }

    public void chia(int phanThuc2, int phanAo2) {
        int tst = (phanThuc * phanThuc2 + phanAo * phanAo2);
        int tsa = (phanAo * phanThuc2 - phanThuc * phanAo2);
        int ms = (phanThuc2 * phanThuc2 + phanAo2 * phanAo2);
        System.out.println("" + phanThuc + "+(" + phanAo + "i) / " + phanThuc2 + "+(" + phanAo2 + "i) = "
                + "("+tst + "/" + ms + ") + ("+tsa+"/"+ms+")i");
    }
}
