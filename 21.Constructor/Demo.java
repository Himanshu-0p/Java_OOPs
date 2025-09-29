class Human{
    String name;
    int age;
    
    //Constructor(no arguments)
    public Human(){
        name ="Unknown";
        age = 0;
        System.out.println("Constructor called: Default values is assigned");
    }
    
    public Human(String name ,int age){
        this.name = name;
        this.age = age ;
        System.out.println("Constructor called : Values assigned");
    }

    void display(){
        System.out.println("Name "+ name +" ,Age" + age);
    }


}

public class Demo{
    public static void main(String[] args) {
        //Object created using defualt constructor
        Human h1 = new Human();
        h1.display();

        //Object created using parametrized constructor
        Human h2 =new Human("Himanshu",21);
        h2.display();

    }
}