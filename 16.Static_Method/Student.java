class Student {
    int marks = 90; // instance variable

    static void printMarks(Student s) {
        System.out.println(s.marks); // access via object
    }

    public static void main(String[] args) {
        Student obj = new Student();
        Student.printMarks(obj); // passing object to static method
    }
}
//Basically static variable can be passed via static method easily without any need to create a object.But that is no in the case of instance variable when we pass instance variabe thru static method we need to create theire object first and then pass theire reference thru the static method block.