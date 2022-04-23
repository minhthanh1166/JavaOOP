package Hello;

public class vdowhile2 {
    public static void main(String[] args){
        int giaithua = 1, i=1;
        do{
            giaithua *= i;
            i++;
        }
        while (i<=5);
        System.out.print("5! = " + giaithua);
    }
}
