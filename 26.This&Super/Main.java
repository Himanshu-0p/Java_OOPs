class A extends Object
{

    public A(){
        super();
        System.out.println("in A");
    }

    public A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        super(5);  // super() is always there but dont see it.It is used parent chaining or superclass chaining
        System.out.println("in B");
    }
    public B(int n){
        this(n);  
        System.out.println("in B int");
    }
}


public class Main {
    public static void main(String[] args) {
        B b = new B();
    }
}
