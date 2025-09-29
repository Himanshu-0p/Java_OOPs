class Human {
    String name;
    int age;

    // Constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Demo {
    public static void main(String[] args) {
        // Anonymous object: directly calling the display() method
        new Human("Himanshu", 21).display(); //Anonymous object can created only once and its doesn't have refernce 
    }
}
