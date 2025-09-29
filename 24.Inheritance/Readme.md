Java Inheritance - Interview Notes

Inheritance is one of the core concepts of Object-Oriented Programming (OOP) in Java. It allows a new class to acquire properties and behaviors of an existing class, promoting code reusability and better class relationships.

1. What is Inheritance?

Inheritance allows a class to inherit fields and methods from another class.

Helps in extending functionalities without rewriting existing code.

Requires only the class file of the parent class; the .java file is not mandatory.

Syntax: extends keyword is used to inherit a class.

class Parent {
    int data = 10;
}

class Child extends Parent {
    void display() {
        System.out.println("Data: " + data);
    }
}

2. Main Aim of Inheritance

Code Reusability: Avoid rewriting existing logic.

Time & Resource Saving: Faster development by using existing classes.

Better Class Relationships: Establishes logical hierarchies between classes.

Method Overriding: Allows a subclass to provide a specific implementation of a method defined in the parent class.

3. Key Points about Inheritance in Java

Superclass and Subclass

Every class has a superclass called Object by default.

If no explicit superclass is mentioned, the class implicitly extends Object.

One-to-Many Relation

A superclass can have multiple subclasses.

A subclass can have only one superclass (Java supports single inheritance).

Constructors

Not inherited by the subclass.

A subclass can invoke the constructor of the superclass using super().

Access Modifiers

Subclasses cannot access private members of the parent class directly.

4. Summary Table
Concept	Details
Keyword	extends
Superclass	Parent class from which features are inherited
Subclass	Child class which inherits features
Constructor inheritance	Constructors are not inherited, but can be invoked using super()
Access to private members	Not inherited
Reusability	Core purpose
Method Overriding	Achieved through inheritance
Default Superclass	Object class
5. Example
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited method
        d.bark();  // subclass method
    }
}


Output:

Eating...
Barking...


✅ Interview Tips:

Always mention single inheritance in Java.

Know that multiple inheritance is not allowed via classes (but allowed via interfaces).

Highlight the super keyword and method overriding.

Understand private vs protected vs public members in inheritance.