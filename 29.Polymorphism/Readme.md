Polymorphism – Interview Notes
==============================

### Definition

*   **Polymorphism** is one of the four pillars of Object-Oriented Programming (OOP).
    
*   The term comes from Greek: **"poly" = many, "morph" = forms/behaviors**.
    
*   It means the **same action/operation behaves differently in different situations**.
    

### Types of Polymorphism in Java

#### 1\. **Compile-Time Polymorphism (Static Binding / Early Binding)**

*   The method to be executed is determined **at compile time**.
    
*   Achieved using **Method Overloading** (same method name with different parameter lists).
    
*   Example: add(int, int) vs add(int, int, int).
    
*   Key Point: Decision is made during **compilation**.
    

#### 2\. **Run-Time Polymorphism (Dynamic Binding / Late Binding)**

*   The method to be executed is determined **at runtime**.
    
*   Achieved using **Method Overriding** (subclass provides a specific implementation of a method already defined in its superclass).
    
*   Example:
    
    *   Class **B** defines add(int, int)
        
    *   Class **A** extends **B** and overrides add(int, int)
        
    *   At runtime, depending on the object type (A or B), the respective method is executed.
        
*   Key Point: Decision is made during **execution**.
    

### Why Polymorphism is Important

*   Promotes **code reusability** and **extensibility**.
    
*   Supports **loose coupling** by allowing methods to work with objects of different classes through a common interface.
    
*   Makes the system more **flexible** and easier to maintain.
    

Loose coupling means that different parts of a program are **independent** and **don’t rely too much on each other’s details**.