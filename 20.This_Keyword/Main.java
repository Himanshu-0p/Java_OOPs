class Human{
    private int age;
    private String name;

    public int getAge(){
        return this.age;   //this keyword is calling the reference of the obj created in the main() method so that we dont need to create new obj
    }
    public void setAge(int age){
        this.age = age;
    }

}


public class Main {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(30);
        System.out.println(obj.getAge());
        
    }
}
