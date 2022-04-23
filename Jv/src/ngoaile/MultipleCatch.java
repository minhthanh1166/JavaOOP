package ngoaile;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int[] a = new int[5];
            a[5] = 4/0;
        }

        catch(ArithmeticException a){
            System.out.println("Lỗi chia 0 đã được xử lý!");
        }
        /*
        catch(IndexOutOfBoundsException i){
            System.out.println("Lỗi vượt qua phần tử của mảng được xử lý ");
        }
         */
        finally{
            System.out.println("Nhung viec can thuc hien ");}
    }
}
