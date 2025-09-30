Abstraction in Java – Interview Notes
=====================================

### 1\. **Abstraction (Concept)**

*   Abstraction is the process of **hiding implementation details** and showing only the **essential functionality** to the user.
    
*   Focuses on **what an object does**, not **how it does it**.
    

### 2\. **Abstract Method**

*   Declared using the abstract keyword.
    
*   Has a **method signature only** (ends with ;), no body/implementation.
    
*   abstract void drive();
    
*   Must be **implemented by the subclass**.
    
*   Cannot be private, final, or static.
    

### 3\. **Abstract Class**

*   Declared with the abstract keyword.
    
*   Can contain **abstract methods, concrete methods, or both**.
    
*   **Objects cannot be created** from an abstract class.
    
*   If a subclass extends an abstract class, it must implement **all abstract methods**.
    
*   An abstract class can have **multiple abstract methods**.
    
*   Useful for providing **base class definitions** with partial implementation.
    

### 4\. **Concrete Class**

*   Any class that is **not abstract** is called a **concrete class**.
    
*   Provides **full implementation** of all methods.
    
*   Objects **can be created**.
    
*   Concrete classes extend abstract classes and **implement abstract methods**.
    

✅ **Quick Interview Highlights**

*   Abstraction = _hiding implementation, showing functionality_.
    
*   Abstract method = _declared, no body_.
    
*   Abstract class = _can have abstract + normal methods, no objects_.
    
*   Concrete class = _fully implemented class, objects allowed_.