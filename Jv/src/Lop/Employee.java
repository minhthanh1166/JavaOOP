package Lop;

import java.util.Scanner;

public class Employee {
    private String fullname;
    private double salary;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print(">> Fullname: ");
        this.fullname = sc.nextLine();

        System.out.print(">> Salary: ");
                this.salary = sc.nextDouble();
    }
    public void output(){
         System.out.println(this.fullname);
         System.out.println(this.salary);
    }
    public static void main(String[] args){
        Employee ep = new Employee();
        ep.input();
        ep.output();
    }
}