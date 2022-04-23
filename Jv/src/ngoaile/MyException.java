package ngoaile;

public class MyException extends Exception {
    public MyException() {
        System.out.println("Số người phải lớn hơn 0");
    }

    public MyException(String massage) {
        super(massage);
    }

}
