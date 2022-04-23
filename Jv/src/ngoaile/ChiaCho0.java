package ngoaile;

public class ChiaCho0 {
    public void chia(){
        int m = 20;
        int n = 0;
        try {
            System.out.println(m + "/" + n + "= " + (m / n));
        }
        catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("Nhung viec can thuc hien");}
    }

    public static void main(String[] args) {
        ChiaCho0 chia0 = new ChiaCho0();
        chia0.chia();
        System.out.println("Quay lai tu ham MainTest ");

    }
}
