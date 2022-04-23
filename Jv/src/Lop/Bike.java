package Lop;

class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle is created");
    }
}

public class Bike extends Vehicle {
    int speed;

    public Bike(int speed) {
        super();
        this.speed = speed;
        System.out.println(speed);
    }

    public static void main(String[] args) {
        Bike b = new Bike(10);
    }

}


