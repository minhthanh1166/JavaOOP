import java.util.Scanner;

public class t3 {
    public static int countWays(int n) {
        int mx = 100000007;
        if(n==1)
            return (int) (3%mx);
        if(n==2)
            return (int) (7%mx);

        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập n = ");
        int n = sc.nextInt();
        System.out.println(countWays(n));
    }
}
