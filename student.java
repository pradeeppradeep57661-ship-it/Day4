
class Student {

    int rollNo = 101;
    String name = "Pradeep";
    String department = "CSE";
    int age = 19;

    void display() {
        System.out.println("Student Details");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student obj = new Student();

        obj.display();
    }
}
