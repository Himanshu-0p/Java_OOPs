// Main.java
class Calculator {               //Calculator class
    int add(int a, int b) {      //Add method
        return a + b;
    }
}

public class Main {  
    public static void main(String[] args) {
        Calculator calc = new Calculator();  //Object creation

        int num1 = 10;
        int num2 = 20;

        int result = calc.add(num1, num2);
        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + result);
    }
}
