package lopCoSo;

class Studentss {
    int id;
    String name;
    String city;

    public Studentss(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name  + ", city: " + city;
    }
}
public class maintest{
    public static void main(String[] args) {

        Studentss s1 = new Studentss(10,"Vietnam", "Hanoi");
        System.out.println(s1);
    }
}

