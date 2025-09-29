Java Inheritance: A Comprehensive Guide 🐕‍🦺
Inheritance is a core concept in Object-Oriented Programming (OOP) in Java. It allows a new class (subclass) to inherit fields and methods from an existing class (superclass), promoting code reusability and establishing a clear "is-a" relationship between classes.

What is Inheritance?
Inheritance enables a class to acquire properties and behaviors from another class, allowing for the extension of functionalities without rewriting existing code. The extends keyword is used to implement this.

Example Syntax
Java

class Parent {
    int data = 10;
}

class Child extends Parent {
    void display() {
        System.out.println("Data: " + data); // Child accesses Parent's data
    }
}
Aims of Inheritance
Code Reusability: Avoid rewriting existing logic, saving time and resources.

Better Class Relationships: Creates a logical hierarchy, making the codebase more organized and easier to understand.

Method Overriding: Allows a subclass to provide a specific implementation for a method already defined in its parent class.

Key Points to Remember
Superclass and Subclass
Every class in Java, unless explicitly extending another, implicitly extends the Object class by default. The superclass is the parent class, and the subclass is the child class that inherits its features.

Inheritance Hierarchy
A superclass can have multiple subclasses. However, a subclass can only have one superclass, meaning Java supports single inheritance for classes.

Constructors
Constructors are not inherited. A subclass can, however, invoke the superclass's constructor using the super() keyword, which must be the first statement in the subclass's constructor.

Access Modifiers
Subclasses can't directly access private members of the parent class. They can access public and protected members.

Example in Practice
This example shows a Dog class inheriting the eat() method from the Animal class.

Java

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
Summary Table
Concept	Details
Keyword	extends
Superclass	Parent class providing features.
Subclass	Child class inheriting features.
Constructor inheritance	Not inherited, but can be invoked with super().
Access to private members	Not inherited.
Reusability	The core purpose.
Method Overriding	A key feature of inheritance.
Default Superclass	Object class.

Export to Sheets
Interview Tips ✅
Always mention single inheritance for classes in Java.

Remember that multiple inheritance is not allowed with classes but is possible with interfaces.

Highlight the super keyword and its role in constructor and method calls.

Understand the distinction between private, protected, and public members within inheritance.