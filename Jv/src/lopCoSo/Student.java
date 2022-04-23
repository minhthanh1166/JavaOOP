package lopCoSo;

public class Student {
    private String id;
    private String name;
    private String email;
    private int age;

    public Student(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student another = (Student) obj;
            /* if (this.id.equals(another.id) && this.name.equals(another.name) &&  this.email.equals(another.email) &&  this.age == another.age){
                return true;
            }
             */
            if(this.id.equals(another.id))
                return true;
        }
        return false;
    }


}
