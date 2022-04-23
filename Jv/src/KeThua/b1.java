package KeThua;

public class b1 {
    public static void main(String[] args) {
        System.out.println("Lãi suất ngân hàng SHB ");
        Bank shb = new SHB();
        System.out.println(shb.getLaiSuat()+"%");

        System.out.println("Lãi suất ngân hàng BIDV ");
        Bank bidv = new BIDV();
        System.out.println(bidv.getLaiSuat()+"%");

        System.out.println("Lãi suất ngân hàng VP Bank ");
        Bank vpbank = new VPBank();
        System.out.println(vpbank.getLaiSuat()+"%");
    }
}
