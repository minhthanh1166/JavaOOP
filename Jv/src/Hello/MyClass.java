package Hello;

public class MyClass {
    int num=5;
    void addOneTo(int num){
        num = num+1;
        System.out.println("Giá trị của num bị thay đổi trong phương thức "+num);
    }
    public static void main(String[] args){
        MyClass Op = new MyClass();
        System.out.println("Giá trị của num trước khi gọi phương thức addOneTo: " + Op.num);
        Op.addOneTo(10);
        System.out.println("Giá trị của num sau khi gọi phương thức addOneTo là: " +Op.num);
    }
}
