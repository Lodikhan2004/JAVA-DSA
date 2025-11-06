package OOPS;


public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "afzal";
        s1.roll = 123;
        s1.marks[0] =90;
        s1.marks[1] =45;
        s1.marks[2] =80;
       
        //copy s1 marks into s2
        Student s2 = new Student(s1);
        s1.marks[2] = 100;
        
        //print s1 marks
        for(int i=0; i<3; i++){
         System.out.print(s1.marks[i]+ " ");
       }

       for(int i=0; i<3; i++){
         System.out.print(s2.marks[i]+ " ");
       }
        
    }
    
}
class Student{
    String name;
    int roll;
    int marks[] = new int[3];

    Student(){
        System.out.println("s1 created");

    }
    //Shallow Copy Constructor (only reference array)
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //Deep copy
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        for( int i=0; i<3 ; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}