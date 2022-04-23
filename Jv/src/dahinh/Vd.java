package dahinh;

// Ví dụ Inner Class
class Outer {
    int n = 2, m = 3;
    Inner inner_obj = new Inner();

    Outer() {
        System.out.println("m =" + m + ", n=" + n + ", k= " + inner_obj.k);
    }

    class Inner {
        int k = 3;

        Inner() {
            System.out.println("Inner acess Outer: m =" + m + ", n= " + n);
        }
    }
}

public class Vd {
    public static void main(String[] args) {
        Outer obj = new Outer();
        System.out.println("m= "+obj.m+", n= "+obj.n+", k= "+obj.inner_obj.k);

    }
}
