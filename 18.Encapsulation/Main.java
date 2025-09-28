class Human{
    private int age ;
    private String name ;

    public int getAge(){
        return age;
    }
    
    public void setAge(int a){
        age = a;
    }

    public void setName(String b){
        name =b;
    }

    public String getName(){
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(22);
        obj.setName("Himanshu");
        System.out.println(obj.getName()+ ":"+ obj.getAge());

    }
}
