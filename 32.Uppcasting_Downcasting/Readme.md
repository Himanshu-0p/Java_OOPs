Typecasting in Java – Interview Notes
=====================================

### Definition

*   **Typecasting** is the process of converting one data type into another.
    
*   Two categories:
    
    1.  **Primitive Typecasting**
        
    2.  **Non-Primitive Typecasting (Objects)**
        

### 1\. **Primitive Typecasting**

*   **Implicit Typecasting (Widening / Type Promotion)**
    
    *   Conversion happens **automatically** when a smaller type is assigned to a larger type.
        
    *   int i = 5;
        
        double d = i; // int → double
        
*   **Explicit Typecasting (Narrowing)**
    
    *   Conversion must be **manually specified** when a larger type is converted into a smaller type.
        
    *   double d = 4.5;
        
        int i = (int) d; // double → int
        

### 2\. **Non-Primitive Typecasting (Objects)**

*   Refers to converting between **parent and child class references**.
    
*   Requires **inheritance relationship**; otherwise, casting is not possible.
    

#### (a) **Upcasting (Child → Parent)**

*   Done **implicitly** or explicitly.
    
*   A child object is referred to by a **parent reference**.
    
*   Only parent’s methods are accessible (child-specific methods are hidden).
    
*   A obj = new B(); // Upcasting
    
    obj.show1(); // Parent method accessible
    

#### (b) **Downcasting (Parent → Child)**

*   Done **explicitly**.
    
*   Allows access to child-specific methods.
    
*   Must ensure the object being cast actually refers to a child, otherwise ClassCastException.
    
*   ((B)obj).show2(); // Downcasting to access child method
    

### Key Points

*   **Upcasting** is always safe (no loss of information).
    
*   **Downcasting** is not always safe → must be used carefully with instanceof check in practice.
    
*   Object typecasting is similar to primitive typecasting but restricted to **inheritance hierarchy**.
    

👉 In interviews, highlight:

*   **Upcasting = generalization** (child to parent).
    
*   **Downcasting = specialization** (parent to child).
    
*   Compile-time vs runtime behavior (downcasting errors appear at runtime).