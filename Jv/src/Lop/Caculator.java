package Lop;

public class Caculator {

    public int add(int... a){
        int result = 0;

        for(int i=0;i<a.length;i++){
            result += a[i];
        }
        return result;
    }
    public static void main(String[] args){
        Caculator cal = new Caculator();

        System.out.println("Sum of four: "+ cal.add(1,2,3,4));
        System.out.println("Sum of five: "+ cal.add(5,2,5,3,7));
    }
}
