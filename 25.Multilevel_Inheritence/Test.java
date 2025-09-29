class Animal{
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

class Shepherd extends Dog{
    void guard(){
         System.out.println("Dog Guard");
    }
}

public class Demo {
    public static void main(String[] args) {
        Shepherd shp = new Shepherd();
        shp.eat();
        shp.bark();
        shp.guard();
    }
}
