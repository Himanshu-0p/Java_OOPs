class Calculator{
      public int add(int num1,int num2,int num3){
            return num1+num2+num3;
      }
      public int add(int num1,int num2){
            return num1+num2;
      }
      public double add(double num1,int num2){
             return num1+num2;
      }
      //Method Overloading : Return type doesn't matter only Parameter Name and Parameter Type matters.
}



public class Main {
    public static void main(String [] agrs){
       Calculator calci = new Calculator();
       int r1 = calci.add(10,14,15);
       System.out.println(r1);

    } 
}
