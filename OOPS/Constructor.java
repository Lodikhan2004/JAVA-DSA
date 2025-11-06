package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("afzal");
        System.out.println(s1.name);
        Student s2 = new Student("venkat");
        System.out.println(s2.name);   
    }   
}
class Student{
    String name;
    int roll;

    Student(String name){
        System.out.println("constructor is called when object is created");
        this.name = name;
    }
}
