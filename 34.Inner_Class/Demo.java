class A{
    public void run(){
        System.out.println("Morning Run..");
    }

    class B{
        public void gym(){
            System.out.println("Go to gym");
        }
    }
    static class C{
        public void cycling(){
            System.out.println("Cycling in the evening");
        }
    }
}

public class Demo {
    public static void main(String[] args){
           A obj = new A();
           obj.run();

           A.B obj1 = obj.new B(); //this is done because B is not static.
           obj1.gym();

           A.C obj2 = new A.C();  //this is done because C is static.
           obj2.cycling();
    }
}
