import java.util.Scanner;

public class t302 {
    public static int countWays(int n) {
        if(n==1)
            return 3;
        long a = 2, b = 1, x;
        long mx = (long) (Math.pow(10,9) + 7);
        while(n>=2){
            x = a%mx;
            a = (a + 2*b)%mx;
            b = (x + b)%mx;
            n--;
        }

        return (int) ((a + b)%mx);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập n = ");
        int n = sc.nextInt();
        System.out.println(countWays(n));
    }

}
