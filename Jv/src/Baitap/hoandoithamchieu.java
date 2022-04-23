package Baitap;

import java.util.Scanner;

class Num{
        int num;
        public int getNum(){
            return num;
}

    public void setNum(int num) {
        this.num = num;
    }
}

public class hoandoithamchieu {
   public static void main(String[] args){
       Num a = new Num();
       Num b = new Num();
       hoandoithamchieu hv = new hoandoithamchieu();
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhập a= ");
       a.setNum(sc.nextInt());
       System.out.print("Nhập b= ");
       b.setNum(sc.nextInt());
       System.out.println("Trước hoán vị: a= "+a.getNum()+", b= "+b.getNum());
       hv.hoanDoi(a,b);
       System.out.println("Sau hoán vị: a= "+a.getNum()+", b= "+b.getNum());
   }
    static void hoanDoi(Num a, Num b){
        int tg = a.getNum();
        a.setNum(b.getNum());
        b.setNum(tg);
    }
}
