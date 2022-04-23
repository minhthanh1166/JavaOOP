import java.util.Scanner;

public class t303 {
    public static int countWays(int n) {
        long mx = (long) (Math.pow(10,9) + 7);
        if(n==1)
            return (int) (3%mx);
        if(n==2)
            return (int) (7%mx);

        return (int) (((2 * countWays(n-1))%mx + countWays(n-2)%mx)%mx);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập n = ");
        int n = sc.nextInt();
        System.out.println(countWays(n));
    }
}
