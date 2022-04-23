import java.util.Scanner;

public class t4 {
    public static int numbersfnc(int n) {
        int temp, res = 0;

        while (n > 0) {
            temp = n % 10;
            res = res * 10 + temp;
            n = n / 10;

        }
        return res;
    }

    public static int functionsNumber(long n) {
        int[] gx = new int[(int) n];
        int count = 0;
        for (int x = 1; x <= n; x++) {
            gx[x - 1] = x / numbersfnc(numbersfnc(x));
        }


        for (int i = 0; i < gx.length; i++) {
            for (int j = i + 1; j < i; j++) {
                if(gx[i] == gx[j]){
                    for (int k = i; k < n; k++)
                    {
                        gx[k] = gx[k + 1];
                        n--;
                        i--;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(gx[i] + "   ");
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        int n = r.nextInt();

        System.out.println(functionsNumber(n));


    }
}
