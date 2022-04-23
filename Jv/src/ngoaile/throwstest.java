package ngoaile;

public class throwstest {
    static void validate(int age){
        try {
            if (age < 0)
                throw new ArithmeticException("not valid");
            else
                System.out.println("Valid");
        }
        catch (ArithmeticException ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }
    public static void main(String[] args) {
        validate(-2);
        System.out.println("rest of the code:.....");

    }
}
