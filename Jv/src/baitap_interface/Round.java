package baitap_interface;

public class Round implements Shape {
    private double radius;
    private final double PI = 3.14;

    public Round() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("Diện tích hình tròn là: " + (PI * radius * radius));

    }

    @Override
    public void getPerimetter() {
        System.out.println("Chu vi hình tròn là: " + (2 * radius * PI));
    }
}
