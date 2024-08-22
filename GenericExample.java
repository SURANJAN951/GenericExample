import java.util.ArrayList;

class Student{
    int Id;
    String name;
}

class Teacher{
    int Id;
    String name;
}

public class GenericExample {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("pw");
        al.add("skills");
        al.add("java");
        al.add("Learning");
        String company = al.get(0);
        String skills = al.get(1);
        String language = al.get(2);
        System.out.println(company + skills + language);
        System.out.println("************************************************");
        Student obj = new Student();
        Student obj2 = new Student();
        Teacher obj3 = new Teacher();
        ArrayList<Student> data = new ArrayList<Student>();
        data.add(obj);
        data.add(obj2);
        //data.add(obj3); This will show error because ham pehle hi
        //specify kar rahe hai ki ham student class ke sath handle karenge
    }
}
