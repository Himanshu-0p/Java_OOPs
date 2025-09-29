class Calc{
    public int add(int a, int b){
        return a + b; //in method overloading we saw that methods can have same name but cannot have same type of the paramters
    }
}

class AdvCalc extends Calc{
    public int add(int a , int b){
        return a+b+1;  //in method overriding only behaviour changes not the type of the paramters
    }
}

public class Main{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3,4);
        System.out.println(r1);

    }
}

//Overloading = same name, different parameters (compile time).
//Overriding = same signature, different class levels (runtime).