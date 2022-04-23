package KeThua;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee em = new Employee("ABC", 18, "Ha Noi", 5000000);
        em.outPut();
/*
        Employee e = new Employee();
        e.inPut();
        e.outPut();
*/
        ArrayList<Employee[]> nvlist = new ArrayList<>();
        System.out.println("Số nhân viên: ");
        int n=sc.nextInt();
        Employee[] nv = new Employee[n];
        for(int i=0;i<n;i++){
            nv[i] = new Employee();
            nv[i].inPut();
            nvlist.add(nv);
        }
        for (Employee[] list : nvlist) {
            System.out.println(Arrays.toString(list));
        }

    }
}
