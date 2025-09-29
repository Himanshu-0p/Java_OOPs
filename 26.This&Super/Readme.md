Java Constructors & Special Keywords – Interview Notes
======================================================

1\. Object Creation & Constructors
----------------------------------

*   Whenever an object is created, the constructor of the class is invoked.
    
*   Constructors of both **superclass and subclass** are called during object creation.
    
*   **Default constructor** is called if no arguments are passed.
    
*   **Parameterized constructor** is called when arguments are provided.
    

2\. super() Method
------------------

*   Hidden in every constructor as the first statement.
    
*   Calls the **constructor of the immediate superclass**.
    
*   If no parameters → calls the **default constructor** of superclass.
    
*   If parameters are passed → calls the **parameterized constructor** of superclass.
    
*   To explicitly call a superclass parameterized constructor → super(args);.
    

3\. Object Class
----------------

*   Every class in Java **implicitly extends Object** class.
    
*   Object class provides common methods (e.g., toString(), equals(), hashCode()).
    
*   Hence, constructor chaining goes up to Object class → an example of **multilevel inheritance**.
    

4\. this() Method
-----------------

*   Used to call **constructor of the same class**.
    
*   No parameters → calls default constructor.
    
*   With parameters → calls parameterized constructor.
    

🔥 **Interview Tip:**

*   Use super() for **parent constructor chaining**.
    
*   Use this() for **overloaded constructor chaining** within the same class.