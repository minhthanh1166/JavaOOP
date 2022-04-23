package baitap_interface;

public class Square implements Shape {
    private double side;

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void getArea() {
        System.out.println("Diện tích hình vuông là: " + (side * side));
    }

    @Override
    public void getPerimetter() {
        System.out.println("Chu vi hình vuông là: " + (side * 4));
    }
}
