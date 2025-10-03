interface A {

    int age = 45;         //var created in interface are static and final cannot be changed.
    String name = "XYZ";

    void show();
    void config();
}

class B implements A{
     public void show(){
        System.out.println("in show");
     }
     public void config(){
        System.out.println("in config");
     }
}

public class Main {
    public static void main(String[] args){
            A obj;
            obj = new B();

            obj.show();
            obj.config();
    }
}
