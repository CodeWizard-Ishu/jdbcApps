class Student implements Cloneable {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void getStudentDetails(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(1, "john", 24);
        System.out.println("Student details by original object");
        s1.getStudentDetails();

        Student s2 = (Student)s1.clone();
        System.out.println("Student details by clone object:");
        s2.getStudentDetails();
    }
}