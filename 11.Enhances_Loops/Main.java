class Student {
    int rollnos;
    String name;
    int marks;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollnos = 1;
        s1.name = "Himanshu";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollnos = 2;
        s2.name = "Tempo";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollnos = 3; // fixed logically
        s3.name = "Neeerja";
        s3.marks = 90;

        // System.out.println(s1.name + ":" + s1.marks);

        Student[] students = new Student[3]; 
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student stud : students){
            System.out.println(stud.name + " " + stud.marks);
        }
    }
}
