package lopCoSo;

public class EqualsStudent {
    public static void main(String[] args) {
        Student s1 = new Student("123","Cong","cong@gmail.com",22);
        Student s2 = new Student("123","Cong","cong@gmail.com",22);
        Student s3 = new Student("456","Dung","dung@gmail.com",18);

        System.out.println("student1 == student2  "+(s1==s2));
        System.out.println("student1.equals(student2)  "+(s1.equals(s2)));
        System.out.println("student2.equals(student3)  "+(s2.equals(s3)));

    }
}
