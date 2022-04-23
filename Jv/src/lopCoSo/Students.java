package lopCoSo;

public class Students implements Cloneable {
    int id;
    String name;

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Students s1 = new Students(10, "Ha");
        Students s2 = (Students) s1.clone();
        System.out.println("s1: "+s1.id + " " + s1.name);
        System.out.println("s2: "+s2.id + " " + s2.name);
    }
}
