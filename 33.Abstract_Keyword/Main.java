abstract class A {
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Music is playing..");
    }
}

abstract class B extends A {
    @Override
    public void drive() {
        System.out.println("Drive..");
    }
}

class C extends B {
    @Override
    public void fly() {
        System.out.println("Car cannot fly");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.fly();       // Output: Car cannot fly
        obj.drive();     // Output: Drive..
        obj.playMusic(); // Output: Music is playing..
    }
}
