package ngoaile;

public class HelloCatchException {
    public static void main(String[] args) {
        System.out.println("Three ");
        int value = 10 / 2;
        System.out.println("Two ");
        value = 10 / 1;
        try {
            System.out.println("One ");
            value = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error: "+  e.getMessage());
            System.out.println("Igonre! ");
        }
        System.out.println("Value= " + value);
        System.out.println("Lets go!");
    }
}
