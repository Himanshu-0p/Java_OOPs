enum Laptop {
    Mackbook(2000), XPS(2200), Surface, ThinkPad(1800); //these are the objects of class Laptops

    private int price;

    // No-arg constructor
    private Laptop() {
        price = 500;
    }

    // Constructor with price
    private Laptop(int price) {
        this.price = price;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}


//Note that Enums doesnt follow the concept of the Inheritance
// Use enum when: you need a fixed, unchangeable set of constants with type-safety and readability.
// Use class when: you need a blueprint for objects with varying behavior and values.